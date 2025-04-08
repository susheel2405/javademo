package com.neoteric.javademo.appointement2;

public class DoctorAppointement {

    private Doctor doctor;
    private Patient patient;
    private Duration duration;
    private String date;
    private String startTime;
    private String endTime;
    private DoctorAppointement followAppointement;

    public DoctorAppointement(Doctor doctor, Patient patient, String date, String startTime) {
        this.doctor = doctor;
        this.patient = patient;
        this.duration = new Duration();
        this.date = date;
        this.startTime = startTime;
        this.endTime = calculateEndTime(startTime);
    }

    private String calculateEndTime(String startTime) {
        String[] parts = startTime.split(":");
        int hour = Integer.parseInt(parts[0]);
        int minute = Integer.parseInt(parts[1].split("")[0]);
        String period = parts[1].split("")[1];

        minute += 30;
        if (minute >= 60) {
            minute -= 60;
            hour++;
        }

        if (hour == 12 && period.equals("AM")) {
            period = "PM";
        } else if (hour == 12 && period.equals("PM")) {
            period = "AM";
        } else if (hour > 12) {
            hour -= 12;
        }
        return String.format("%d:%02d %s", hour, minute, period);
    }

    public void setFollowUpAppointment(DoctorAppointement followUp) {
        if (isFollowUpWithin30Days(this.date, followUp.date)) {
            this.followAppointement = followUp;
        } else {
            System.out.println("Follow-up appointment must be within the next 30 days.");
        }
    }

    private boolean isFollowUpWithin30Days(String initialDate, String followUpDate) {
        // Simple logic to check if follow-up is within 30 days
        return Math.abs(Integer.parseInt(followUpDate.split("-")[2]) - Integer.parseInt(initialDate.split("-")[2])) <= 30;
    }


    public void displayAppointmentDetails() {

        if (isLunchBreak(startTime) || isLunchBreak(endTime)) {
            System.out.println("No appointements available during lunch break(12:00PM - 2:00PM.\n");
        } else {
            System.out.println("Appointement Details:");
            System.out.println("Docktor: " + doctor.getName() + "( " + doctor.getSpecialization() + ")");
            System.out.println("Patient:" + patient.getName() + ", Age:" + patient.getAge());
            System.out.println("Date:" + date);
            System.out.println("Satrt Time:" + startTime);
            System.out.println("End Time:" + endTime);
            System.out.println("Duration:" + duration.getDuration());
            if (followAppointement != null) {
            System.out.println("\nFollow-up Appointement");
            followAppointement.displayAppointmentDetails();
        }
    }
}
private boolean isLunchBreak(String time){
    return time.equals("12:00 PM") || time.equals("12:30 PM") || time.equals("1:00 PM") || time.equals("1:30 PM") || time.equals("2:00 PM");
}

}





