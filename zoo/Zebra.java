package com.ing.zoo;

import java.util.Random;

public class Zebra extends Animal{
    public String trick;

    public Zebra(String name, String helloText, String eatText, String trick)
    {
        super(name, helloText, eatText);
        this.trick = trick;
    }

    public void sayHello()
    {
        helloText = "zebra zebra";
        System.out.println(helloText);
    }

    public void eatLeaves()
    {
        eatText = "munch munch zank yee bra";
        System.out.println(eatText);
    }


    public void performTrick()
    {
        Random random = new Random();
        int rnd = random.nextInt(2);
        if(rnd == 0)
        {
            trick = "turns only white";
        }
        else
        {
            trick = "scratches ears";
        }
        System.out.println(trick);
    }
}
