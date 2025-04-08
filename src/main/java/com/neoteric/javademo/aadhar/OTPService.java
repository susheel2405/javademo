package com.neoteric.javademo.aadhar;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public class OTPService {


    private static final Map<String, Integer> otpStorage = new HashMap<>();
    private static final Map<String, ScheduledFuture<?>> otpTimers = new HashMap<>();
    private static final ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);

    public static int generateOTP(String userId) {
        String uuid = UUID.randomUUID().toString().replaceAll("[^0-9]", "");
        int otp = Integer.parseInt(uuid.substring(0, 6));

        otpStorage.put(userId, otp);
        System.out.println("OTP sent to user (" + userId + "): " + otp);

        ScheduledFuture<?> task = scheduler.schedule(() -> {
            otpStorage.remove(userId);
            otpTimers.remove(userId);
            System.out.println(" OTP for user " + userId + " has expired.");
        }, 3, TimeUnit.MINUTES);

        otpTimers.put(userId, task);
        return otp;
    }

    public static boolean validateOTP(String userId, int enteredOTP) {
        if (otpStorage.containsKey(userId) && otpStorage.get(userId) == enteredOTP) {
            otpTimers.get(userId).cancel(true);
            otpStorage.remove(userId);
            otpTimers.remove(userId);
            return true;
        }
        return false;
    }
}
