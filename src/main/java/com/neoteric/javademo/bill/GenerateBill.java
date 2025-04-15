package com.neoteric.javademo.bill;

public class GenerateBill {

    public static void main(String[]args){


        PlanFactory factory = new DomesticPlanFactory();
        Plan domestic = factory.getplan("plan");
        domestic.setRate(11);
        domestic.calculateBill(100);


        factory = new InstitutionalPlanFactory();
        Plan institutional = factory.getplan("plan1");
        institutional.setRate(33);
        institutional.calculateBill(110);


        factory = new CommercialPlanFactory();
        Plan commercial = factory.getplan("Plan2");
        commercial.setRate(22);
        commercial.calculateBill(120);

    }
}
