package com.neoteric.javademo.aadhar;

public class AadharTest {

    public static void main(String[] args) {
        String aadhaar1 = AadharGenerator.generateAadhaarNumber();
        String aadhaar2 = AadharGenerator.generateAadhaarNumber();

        System.out.println("Generated Aadhaar 1: " + aadhaar1);
        System.out.println("Generated Aadhaar 2: " + aadhaar2);

        assert aadhaar1.length() == 12 : "Aadhaar Number should be 12 digits";
        assert aadhaar2.length() == 12 : "Aadhaar Number should be 12 digits";
        assert !aadhaar1.equals(aadhaar2) : "Aadhaar Numbers should be unique";

        System.out.println(" AadhaarServiceTest Passed!");
    }
}
