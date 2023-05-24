package com.ing.zoo;

public class Hippo extends Animal{

    public Hippo(String name, String helloText, String eatText)
    {
        super(name, helloText, eatText);
    }

    public void sayHello()
    {
        helloText = "splash";
        System.out.println(helloText);
    }

    public void eatLeaves()
    {
        eatText = "munch munch lovely";
        System.out.println(eatText);
    }
}
