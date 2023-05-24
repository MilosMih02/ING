package com.ing.zoo;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Zoo {
    public static void main(String[] args) {
        Map<String, Animal> animals = new HashMap<>();
        animals.put("henk", new Lion("Henk", "", ""));
        animals.put("elsa", new Hippo("Elsa", "", ""));
        animals.put("dora", new Pig("Dora","",""));
        animals.put("wally", new Tiger("Wally","","",""));
        animals.put("marty", new Zebra("Marty","","",""));

        //adding values to keys, for each command I add a method
        Map<String, String> commands = new HashMap<>();
        commands.put("hello", "sayHello");
        commands.put("give leaves", "eatLeaves");
        commands.put("give meat", "eatMeat");
        commands.put("perform trick", "performTrick");

        System.out.println("Welcome to the Zoo app! There are multiple animals with different names. You can feed the animals, greet them, and make them do tricks!");
        Scanner scanner = new Scanner(System.in);

        String input;

        while (true) {
            input = scanner.nextLine();

            if (input.equalsIgnoreCase("exit")) {
                break;
            }

            //splits the 2 words, that each get an index, 1 and 0. It checks if there are 2 words to validate here.
            String[] parts = input.split(" ");
            if (parts.length != 2) {
                System.out.println("Unknown command: " + input);
                continue;
            }

            //annoying that the commands from the array cannot be recognised, so I force both the name and command to have no capital letters
            String command = parts[0].toLowerCase();
            String animalName = parts[1].toLowerCase();

            //so from the animal map, we compare the animalName String we used as input. we check if it is on the list and if it is not, we give an error
            Animal animal = animals.get(animalName);
            if (animal == null) {
                System.out.println("Unknown animal: " + animalName);
                continue;
            }

            //does the same thing but for the command map
            String methodName = commands.get(command);
            if (methodName == null) {
                System.out.println("Unknown command: " + command);
                continue;
            }

            //try tests the errors, catch executes. We test if there is a method in the given animal class that coorelates with the command
            try {
                animal.getClass().getMethod(methodName).invoke(animal);
            } catch (Exception e) {
                System.out.println("Failed to execute command: " + command);
            }
        }

        System.out.println("Application closed");
    }
}