package io.zipcoder;


import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        int numPets;
        System.out.println("How many pets you got?!");
        Scanner in = new Scanner(System.in);
        numPets = in.nextInt();
        Pet[] pets = new Pet[numPets];
        for(int i = 0; i < numPets; i++) {
            System.out.println("What is pet #" + (i+1) + "'s type?");
            String petType = in.next().toLowerCase();
            String petName;
            switch(petType) {
                case "dog":
                    System.out.println("what's doggo's name?");
                    petName = in.next();
                    pets[i] = new Dog(petName);
                    break;
                case "cat":
                    System.out.println("What's kitty's name?");
                    petName = in.next();
                    pets[i] = new Cat(petName);
                    break;
                case "fox":
                    System.out.println("How do you keep getting foxes? THEYRE WILD ANIMALS. what's its name? ");
                    petName = in.next();
                    pets[i] = new Fox(petName);
                    break;
                default:
                    i--;
                    break;

            }

        }
        for(Pet pet: pets) System.out.println(pet);
    }
}
