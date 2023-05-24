package com.ing.zoo;

public class Lion extends Animal {

    public Lion(String name, String helloText, String eatText)
    {
        super(name, helloText, eatText);
    }

    public void sayHello()
    {
        helloText = "roooaoaaaaar";
        System.out.println(helloText);
    }

    public void eatMeat()
    {
        eatText = "nomnomnom thx mate";
        System.out.println(eatText);
    }
}
