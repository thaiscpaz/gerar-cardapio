package com.personal.project.generatemenu.model;

public enum MealEnum {

    BREAKFAST("Breakfast"),
    LUNCH("Lunch"),
    DINNER("Dinner"),
    SNACK("Snack");

    public String meal;

    MealEnum(String meal){
        this.meal = meal;
    }

    public String getMeal() {
        return meal;
    }
}
