package com.neoteric.javademo.appointment;

public class DoctorAppointment {

    private Doctor doctor;
    private Patient patient;
    private Duration duration;
    private String dtae;
    private String startTime;
    private String endTime;
    private DoctorAppointment followUpAppointement;

    public DoctorAppointment (Doctor doctor, Patient patient, Duration duration,String dtae, String startTime,String endTime){
        this.doctor = doctor;
        this.patient = patient;
        this.dtae = dtae;
        this.startTime = startTime;
        this.duration = duration;

    }

    public void  setFollowUpAppointement(DoctorAppointment followup){
        this.followUpAppointement = followup;
    }

    public void dispalyAppointmentDetails(){
        if(isLunchBreak(startTime) || isLunchBreak(endTime)){
            System.out.println("No appontements available during LunchBreak (12:00pm- 2:00pm). \n");

        }else {
            System.out.println("Appontement Details");
            System.out.println("Doctor:" + doctor.getName()+ "(" +doctor.getSpecialization()+")");
            System.out.println("Patient:" + patient.getName()+ ", Age" + patient.getAge());
            System.out.println("Dtae:" + dtae );
            System.out.println("Start Time:" + startTime);
            System.out.println("End Time:" + endTime);
            System.out.println("Duration:" + duration.getDuration());

            if (followUpAppointement != null){
                System.out.println("\nfollow-up Appointement");
                followUpAppointement.dispalyAppointmentDetails();
            }
        }
    }

    private boolean isLunchBreak(String time){
        return time.equals("12:00pm") || time.equals("12:30pm") || time.equals("1:00pm") || time.equals("1:30pm") || time.equals("2:00pm");
    }
}
