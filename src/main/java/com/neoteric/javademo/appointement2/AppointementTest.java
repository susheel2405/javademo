package com.neoteric.javademo.appointement2;

import java.util.List;

public class AppointementTest {
    public static void main(String[] args) {
        AppointmentService service = new AppointmentService();
        List<Doctor> neurology = service.getNeurology();
        for (Doctor doctor : neurology){
            System.out.println("Available Neurology:" + doctor.getName());

        }
       Patient patient = new Patient("Rahul: " , 25);
        DoctorAppointement appointement = new DoctorAppointement(neurology.get(0),patient, "2025-04-10", "10:00AM");
        DoctorAppointement followup = new DoctorAppointement(neurology.get(0), patient,"2025-05-17","11:00AM");
        appointement.displayAppointmentDetails();
        appointement.setFollowUpAppointment(followup);
    }
}
