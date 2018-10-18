package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Boolean

        Scanner input = new Scanner(System.in);
        ArrayList<Person> personality = new ArrayList<>();

        String myanswer = "";

        do {

            System.out.println("Enter name");
            String name = input.nextLine();

            System.out.println("Does this person like french fries (true or false)");
            boolean likesFrenchFries = input.nextBoolean();

            System.out.println("Does this person like to sleep (true or false)");
            boolean sleep = input.nextBoolean();

            System.out.println("Is this person adventurous (true or false)");
            boolean adventurous = input.nextBoolean();

            personality.add(new Person(name, likesFrenchFries, sleep, adventurous));

            System.out.println("Add another person Y(yes) or N(no)");
            myanswer = input.next();
            input.nextLine();

            System.out.println();

        } while (myanswer.equalsIgnoreCase("yes") || myanswer.equalsIgnoreCase("Y"));


        for (Person newName : personality) {
            System.out.println("Name : " + newName.getName() + "\nLikesFrenchFries: " + newName.isLikesFrenchFries() + "\nLikes sleeping: " + newName.isSleep() + "\nIs adventurous: " + newName.isAdventurous());

        }
        System.out.println("\nAll the people who like french fries");
        for (Person newName : personality) {
            if (newName.isLikesFrenchFries() == true) { //boolean needs equal sign (==) or (!=) sign vs. .equalsIgnoreCase in string
                System.out.println(newName.getName());
            }
        }

    }
}