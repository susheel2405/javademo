package com.neoteric.javademo.bill;

public class CommercialPlanFactory implements PlanFactory {

    @Override
    public Plan getplan(String plan) {
        return new CommercialPlan();
    }
}
