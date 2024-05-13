package com.example.demo.designPatterns;

class SuperClass implements Cloneable
{
    int i = 5;

    @Override
    protected Object clone() throws CloneNotSupportedException
    {
        return super.clone();
    }
}
