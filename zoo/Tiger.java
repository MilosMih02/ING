package com.ing.zoo;

import java.util.Random;

public class Tiger extends Animal{
    public String trick;

    public Tiger(String name, String helloText, String eatText, String trick)
    {
        super(name, helloText, eatText);
        this.trick = trick;
    }

    public void sayHello()
    {
        helloText = "rraaarww";
        System.out.println(helloText);
    }

    public void eatMeat()
    {
        eatText = "nomnomnom oink wubalubadubdub";
        System.out.println(eatText);
    }

    public void performTrick()
    {
        Random random = new Random();
        int rnd = random.nextInt(2);
        if(rnd == 0)
        {
            trick = "jumps in tree";
        }
        else
        {
            trick = "scratches ears";
        }
        System.out.println(trick);
    }
}
