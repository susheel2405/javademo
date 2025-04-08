package com.neoteric.javademo.feepayment;

public abstract class StudentFeePayment {

    protected Student student;

    public StudentFeePayment(Student student){
        this.student = student;
    }

    protected abstract double getExtraCharges();
    protected abstract String getPaymentMethod();


    public void payFees(){

        double baseFee = student.getTotalFees();
        double charges = getExtraCharges();
        double totalAmount = baseFee + charges;


        System.out.println("\n---Payment Recipt---");        // account service transfer banjk transfers
        System.out.println("Roll Number     : " + student.getTotalFees());
        System.out.println("Student Name    : " + student.getName());
        System.out.printf("Base Fee         : ₹%.2f\\n " , baseFee);
        System.out.println("Payment Method  :" + getPaymentMethod());
        System.out.printf("Extra Charges    : ₹%.2f\\n", charges);
        System.out.printf("Total Paid       : ₹%.2f\\n", totalAmount);
        System.out.println("-----------");
        System.out.println("Payment Successful");
    }


}
