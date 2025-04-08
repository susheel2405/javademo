package com.neoteric.javademo.aadhar;

import java.util.Scanner;

public class UserEnrollment {

    public static void enrollUser() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Full Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter Relation (Son/Daughter/Wife of): ");
        String relation = scanner.nextLine();

        System.out.print("Enter Father's Name: ");
        String fatherName = scanner.nextLine();

        System.out.print("Enter Gender (Male/Female/Other): ");
        String gender = scanner.nextLine();

        System.out.print("Enter Date of Birth (DD/MM/YYYY): ");
        String dob = scanner.nextLine();


        System.out.print("Enter Address: ");
        String address = scanner.nextLine();

        String userId = name.toLowerCase().replaceAll(" ", "") + "_ID";

        if (!BiometricScanner.scanFingerprint(userId)) {
            System.out.println(" Fingerprint scan failed. Retry!");
            return;
        }
        if (!BiometricScanner.scanRetina(userId)) {
            System.out.println(" Retina scan failed. Retry!");
            return;
        }

        String aadhaarNumber = AadharGenerator.generateAadhaarNumber();
        System.out.println(" Aadhaar Generated: " + aadhaarNumber);

        int otp = OTPService.generateOTP(userId);
        System.out.print("Enter the OTP received (valid for 3 minutes): ");
        int enteredOTP = scanner.nextInt();

        if (OTPService.validateOTP(userId, enteredOTP)) {
            User newUser = new User(name, fatherName, gender, dob, relation, address, aadhaarNumber);
            newUser.displayAadhaarCard();
            System.out.println(" Aadhaar Enrollment Successful!");
        } else {
            System.out.println(" OTP Validation Failed or Expired! Retry.");
        }
    }

    public static void main(String[] args) {
        System.out.println("===== Aadhaar Enrollment System =====");
        enrollUser();
    }
}
