package com.neoteric.javademo.appointment;

import java.util.ArrayList;
import java.util.List;

public class AppointmentService {

    private List<Doctor>doctors = new ArrayList<>();

    public AppointmentService (){
        doctors.add(new Doctor("Dr. Susheel Reddy" , "Cardiology"));
        doctors.add(new Doctor("Dr. Ganesh Reddy", "Orthopedic"));
        doctors.add(new Doctor("Dr. Karthavya Chowdary", "Critical Care"));
        doctors.add(new Doctor("Dr. Kathik Reddy", "Transplant Pulmonologist"));
        doctors.add(new Doctor("Dr. Kavya Reddy", "Anesthestialogist"));
        doctors.add(new Doctor("Dr. Venkat Reddy", "Neurologist"));

    }

    public List<Doctor>getCardiology(){
        List<Doctor> cardiology = new ArrayList<>();

        for (Doctor doctor : doctors){
            if (doctor.getSpecialization().equals("Cardiology")){
                cardiology.add(doctor);
            }
        }
        return cardiology;
    }
}
