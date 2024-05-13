package com.example.demo;

public final class SingletonTest {

    private static  SingletonTest singletonTest ;

    private SingletonTest(){};

    public static  SingletonTest getInstance(){

        if(singletonTest==null){
           /* synchronized {
                singletonTest = new SingletonTest();
            }*/
        }
       return  singletonTest;
    }
}
