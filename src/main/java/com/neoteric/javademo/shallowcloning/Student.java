package com.neoteric.javademo.shallowcloning;

public class Student implements  Cloneable {

    String name;
   public Address address;

    public Student(String name, Address address){
        this.name = name;
        this.address = address;
    }

    // Shallow Cloning using clone() Method

    @Override
    public Object clone()throws CloneNotSupportedException{
        return super.clone();// Perform sShallow Copy
    }

    public void display(){
        System.out.println("Student Name:" + name);
        System.out.println("City:" + address.city);

    }
}
