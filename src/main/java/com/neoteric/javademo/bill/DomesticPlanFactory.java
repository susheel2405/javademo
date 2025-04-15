package com.neoteric.javademo.bill;

public class DomesticPlanFactory implements PlanFactory {
    @Override
    public Plan getplan(String plan) {
        return new DomesticPlan();
    }
}
