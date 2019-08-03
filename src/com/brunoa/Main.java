package com.brunoa;

public class Main {

    public static void main(String[] args) {
        System.out.println(randomMovie().getName());
    }

    public static Movie randomMovie() {
        int randomNumber = (int) (Math.random() * 5) + 1;
        System.out.println("Random number generated was " + randomNumber);
        switch (randomNumber) {
            case 1:
                return new Jaws();

            case 2:
                return new IndependenceDay();

            case 3:
                return new StarWars();

            default:
                return new Forgettable();


        }
    }
}
