package main.java.generics;

import java.util.ArrayList;
import java.util.List;

/**
public class Generics {
    public static void main(String[] args) {
            ///////////////// Java 5 ////////////////////
            List animals = new ArrayList();
            Animal ourAnimal = new Animal;
            animals.add("cat");
            animals.add("dog");
            animals.add("frog");
            animals.add(ourAnimal);

            String animal = (String) animals.get(1);
            System.out.println(animal);

            /////////////////////// generics /////////////////////
            List<String> animals2 = new ArrayList<String>();
            animals2.add("cat");
            animals2.add("dog");
            animals2.add("frog");
            animals2.add(ourAnimal);

            String animal2 = animals2.get(1);

            ////////////////// Java 7 //////////////////
            List<String> animals3 = new ArrayList<>();
        }
    }

class Animal {

}
**/