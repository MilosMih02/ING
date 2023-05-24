package com.ing.zoo;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Zoo {
    public static void main(String[] args)
    {
        String[] commands = new String[4];
        commands[0] = "hello";
        commands[1] = "give leaves";
        commands[2] = "give meat";
        commands[3] = "perform trick";

        Lion henk = new Lion("Henk", "", "");
        Hippo elsa = new Hippo("Elsa", "", "");
        Pig dora = new Pig("Dora", "", "");
        Tiger wally = new Tiger("Wally", "", "", "");
        Zebra marty = new Zebra("Marty", "", "", "");

        System.out.println("Welcome to the Zoo app! There are multiple animals with different names. You can feed the animals, greet them and make them do tricks!");
        Scanner scanner = new Scanner(System.in);
        String input;

        while(true){

            input = scanner.nextLine();

            if (input.equals(commands[0] + " henk")) {
                henk.sayHello();
            }
            else if (input.equals(commands[2] + " henk")) {
                henk.eatMeat();
            }
            else if (input.equals(commands[0] + " elsa")) {
                elsa.sayHello();
            }
            else if (input.equals(commands[1] + " elsa")) {
                elsa.eatLeaves();
            }
            else if (input.equals(commands[0] + " dora")) {
                dora.sayHello();
            }
            else if (input.equals(commands[1] + " dora")) {
                dora.eatLeaves();
            }
            else if (input.equals(commands[2] + " dora")) {
                dora.eatMeat();
            }
            else if (input.equals(commands[3] + " dora")) {
                dora.performTrick();
            }
            else if (input.equals(commands[0] + " wally")) {
                wally.sayHello();
            }
            else if (input.equals(commands[2] + " wally")) {
                wally.eatMeat();
            }
            else if (input.equals(commands[3] + " wally")) {
                wally.performTrick();
            }
            else if (input.equals(commands[0] + " marty")) {
                marty.sayHello();
            }
            else if (input.equals(commands[1] + " marty")) {
                marty.eatLeaves();
            }
            else if (input.equals(commands[3] + " marty")) {
                marty.performTrick();
            }
            else if(input.equalsIgnoreCase("exit")){
                break;
            }
            else {
                System.out.println("Unknown command: " + input);
            }
        }

        System.out.println("Application closed");
    }
}
