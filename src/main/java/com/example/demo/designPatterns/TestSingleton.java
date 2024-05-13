package com.example.demo.designPatterns;

import java.io.*;
import java.lang.reflect.Constructor;

public class TestSingleton extends SuperClass implements Serializable {

    private static TestSingleton obj;
    private TestSingleton(){
        if(obj!=null){
            throw new RuntimeException("chal bhaag");
        }
    };

    public static TestSingleton getInstance(){
        if(obj==null){
            synchronized(TestSingleton.class) {// multi threading double locking
                if(obj == null) {
                    obj = new TestSingleton();
                }
            }
        }
        return obj;
    }

    @Override
    protected Object clone() {      // to avoid cloning
       return obj;
    }

    protected Object readResolve() {    // to avoid serilization
        return obj;
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        TestSingleton object1 = TestSingleton.getInstance();
        ObjectOutput out = new ObjectOutputStream(new FileOutputStream("file.text"));
        out.writeObject(object1);
        out.close();

        // deserailize from file to object
        ObjectInput in = new ObjectInputStream(new FileInputStream("file.text"));

        TestSingleton object2 = (TestSingleton) in.readObject();
        in.close();

        System.out.println("object1 hashCode:- " + object1.hashCode());
        System.out.println("object2 hashCode:- " + object2.hashCode());

        ///check cloning ------------

        TestSingleton object3 = TestSingleton.getInstance();
        TestSingleton object4 = (TestSingleton) object1.clone();
        System.out.println("object1 hashCode:- " + object3.hashCode());
        System.out.println("object2 hashCode:- " + object4.hashCode());

        ///check Reflection
        TestSingleton object5 = TestSingleton.getInstance();
        TestSingleton object6 = null;
        try
        {
            Constructor[] constructors = TestSingleton.class.getDeclaredConstructors();
            for (Constructor constructor : constructors)
            {
                // Below code will destroy the singleton pattern
                constructor.setAccessible(true);
                object6 = (TestSingleton) constructor.newInstance();
                break;
            }
        }catch (Exception e)
        {
            e.printStackTrace();
        }

        System.out.println("object1 .hashCode():- " + object5.hashCode());
        System.out.println("object2.hashCode():- " + object6.hashCode());
    }
}
