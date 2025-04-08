package com.neoteric.javademo.familytree;

public class Test {
    public static void main(String[] args) {
        GreatGrandFather greatGrandFather = new GreatGrandFather("Venkat", 98);
        GrandFather grandFather = new GrandFather("Ram Reddy", 70);
        Father father = new Father("Venkat reddy", 45);
        Son son = new Son("Susheel reddy", 21);

        System.out.println("GreatGrandFater Details");
        greatGrandFather.display();

        System.out.println("GrandFater Details");
        grandFather.display();

        System.out.println("Fater details");
        father.display();

        System.out.println("Son Details");
        son.display();
    }
}
