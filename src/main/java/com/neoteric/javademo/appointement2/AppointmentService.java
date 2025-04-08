package com.neoteric.javademo.appointement2;

import java.util.ArrayList;
import java.util.List;

public class AppointmentService {

    private List<Doctor> doctors = new ArrayList<>();

    public AppointmentService() {
        doctors.add(new Doctor("Dr. Susheel Reddy: ", "Cardiology"));
        doctors.add(new Doctor("Dr. Ravi Seshu:", "Neurology"));
        doctors.add(new Doctor("Dr. Ganesh Reddy:", "Transplant Pulmonologist"));
        doctors.add(new Doctor("Dr. Karthik Reddy: ", "Orthopedic"));
    }

    public List<Doctor> getNeurology() {
        List<Doctor> neurology = new ArrayList<>();
        for (Doctor doctor : doctors) {
            if (doctor.getSpecialization().equals("Neurology")){
                neurology.add(doctor);
            }
        }
        return neurology;

    }

}


