package com.neoteric.javademo.feepayment;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FeeTest {

    public static void main(String[] args) {
        // Student data setup
        Map<Integer, Student> studentDB = new HashMap<>();
        studentDB.put(101, new Student(101, "Ravi Seshu", 500000));
        studentDB.put(102, new Student(102, "Susheel Reddy", 500000));
        studentDB.put(103, new Student(103, "Gansesh Reddy", 500000));

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Roll Number: ");
        int roll = sc.nextInt();

        Student student = studentDB.get(roll);
        if (student == null) {
            System.out.println("Student with Roll No " + roll + " not found.");
            sc.close();
            return;
        }

        System.out.print("Select Payment Method (1 - NetBanking, 2 - Card): ");
        int choice = sc.nextInt();

        StudentFeePayment payment = null;

        if (choice == 1) {
            payment = new NetBanking(student);
        } else if (choice == 2) {
            payment = new CardPayment(student);
        } else {
            System.out.println("Invalid payment method.");
            sc.close();
            return;
        }

        payment.payFees();
        sc.close();
    }

}
