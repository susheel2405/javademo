package com.neoteric.javademo.exception;

import java.util.HashSet;
import java.util.Set;

public class SeatBookingSystem {


    private Set<Integer> bookedSeats = new HashSet<>();

    public void bookSeat(int seatNumber) throws SeatNotAvailable {
        if (seatNumber <= 0 || seatNumber > 10) {
            throw new IllegalArgumentException("Seat number must be between 1 and 10.");
        }

        if (bookedSeats.contains(seatNumber)) {
            throw new SeatNotAvailable("Seat " + seatNumber + " is already booked.");
        }

        bookedSeats.add(seatNumber);
        System.out.println("✅ Seat " + seatNumber + " successfully booked!");
    }

    public void showAvailableSeats() {
        System.out.print("Available seats: ");
        for (int i = 1; i <= 10; i++) {
            if (!bookedSeats.contains(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}
