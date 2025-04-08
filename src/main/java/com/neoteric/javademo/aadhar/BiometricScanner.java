package com.neoteric.javademo.aadhar;

import java.util.Scanner;

public class BiometricScanner {

    private static final Scanner scanner = new Scanner(System.in);

    public static boolean scanFingerprint(String userId) {
        System.out.println("Place your finger on the scanner...");
        System.out.print("Enter 'yes' if fingerprint matched: ");
        return scanner.nextLine().equalsIgnoreCase("yes");
    }

    public static boolean scanRetina(String userId) {
        System.out.println("Look into the retina scanner...");
        System.out.print("Enter 'yes' if retina matched: ");
        return scanner.nextLine().equalsIgnoreCase("yes");
    }
}
