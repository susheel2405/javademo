package com.neoteric.javademo.aadhar;

import java.util.UUID;

public class AadharGenerator {


    public static String generateAadhaarNumber() {
        String uuid = UUID.randomUUID().toString().replaceAll("[^0-9]", "");
        return uuid.substring(0, 12);
    }
}
