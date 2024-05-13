package com.example.demo.designPatterns;

import java.io.*;
import java.lang.reflect.Constructor;

public class TestSingletonPractice1 extends SuperClass implements Serializable {

    private static  TestSingletonPractice1 obj ;

    private TestSingletonPractice1(){
        if(obj!=null){
            throw new RuntimeException("To hell with Reflection");
        }
    };

    public static TestSingletonPractice1 getInstance(){    // with double locking
        if(obj == null){
            synchronized(TestSingletonPractice1.class){
                if(obj == null){
                    obj = new TestSingletonPractice1();
                }
            }
        }
        return obj;
    }

    @Override
    protected TestSingletonPractice1 clone(){
        return obj;                   // for cloning
    }

    protected Object readResolve(){
        return obj;                     // for Serilaization
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        TestSingletonPractice1 object1 = TestSingletonPractice1.getInstance();
        ObjectOutput out = new ObjectOutputStream(new FileOutputStream("file.text"));
        out.writeObject(object1);
        out.close();

        // deserailize from file to object
        ObjectInput in = new ObjectInputStream(new FileInputStream("file.text"));

        TestSingletonPractice1 object2 = (TestSingletonPractice1) in.readObject();
        in.close();

        System.out.println("object1 hashCode:- " + object1.hashCode());
        System.out.println("object2 hashCode:- " + object2.hashCode());

        ///check cloning ------------

        TestSingletonPractice1 object3 = TestSingletonPractice1.getInstance();
        TestSingletonPractice1 object4 = (TestSingletonPractice1) object1.clone();
        System.out.println("object1 hashCode:- " + object3.hashCode());
        System.out.println("object2 hashCode:- " + object4.hashCode());

        ///check Reflection
        TestSingletonPractice1 object5 = TestSingletonPractice1.getInstance();
        TestSingletonPractice1 object6 = null;
        try
        {
            Constructor[] constructors = TestSingletonPractice1.class.getDeclaredConstructors();
            for (Constructor constructor : constructors)
            {
                // Below code will destroy the singleton pattern
                constructor.setAccessible(true);
                object6 = (TestSingletonPractice1) constructor.newInstance();
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
