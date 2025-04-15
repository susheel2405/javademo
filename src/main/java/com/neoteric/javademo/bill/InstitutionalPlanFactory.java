package com.neoteric.javademo.bill;

public class InstitutionalPlanFactory implements PlanFactory {
    @Override
    public Plan getplan(String plan) {
        return new InstitutionalPlan();
    }
}
