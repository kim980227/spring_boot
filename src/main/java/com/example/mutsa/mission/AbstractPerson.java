package com.example.mutsa.mission;

public class AbstractPerson implements Person{
    String name;
    String occupation;

    @Override
    public void speak() {
        System.out.println("hi i am " + name );
        System.out.println("i am " + occupation);
    }
}
