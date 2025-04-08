package com.neoteric.javademo.appointment;

import java.util.List;

public class AppointementTest {
    public static void main(String[] args) {
        AppointmentService service = new AppointmentService();
        List<Doctor> cardiology = service.getCardiology();

        for (Doctor doctor : cardiology){
            System.out.println("Available Cardiology: " + doctor.getName());

        }

        Patient patient = new Patient(24, "Sri Ram Reddy");
        Duration duration = new Duration(1, 00);
        DoctorAppointment appointment = new DoctorAppointment(cardiology.get(0), patient, duration, "2025-04-10", "10:00AM", "11:00AM");
        DoctorAppointment followup = new DoctorAppointment(cardiology.get(0), patient,duration, "2025-05-17", "11:00AM", "12:00pmPM");

        appointment.setFollowUpAppointement(followup);
        appointment.dispalyAppointmentDetails();
    }
}
