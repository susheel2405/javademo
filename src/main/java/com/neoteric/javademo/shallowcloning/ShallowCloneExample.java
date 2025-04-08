package com.neoteric.javademo.shallowcloning;

public class ShallowCloneExample {
    public static void main(String[] args) throws CloneNotSupportedException {

        Address address = new Address("Hyderabad");
        Student original = new Student("Susheel",address);

        Student cloned = (Student) original.clone();

        System.out.println("Original Object");
        original.display();

        System.out.println("\ncloned object");
        cloned.display();

        cloned.address.city = "Bangalore";

        System.out.println("\nAfter modifying cloned objects city:");


        System.out.println("Original Object:");
        original.display();


        System.out.println("\nCloned Object:");
        cloned.display();


    }
}
