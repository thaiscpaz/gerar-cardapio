package com.personal.project.generatemenu.model;

public enum DayEnum {

    SUNDAY("Sunday"),
    MONDAY("Monday"),
    TUESDAY("Tuesday"),
    WEDNESDAY("Wednesday"),
    THURSDAY("Thursday"),
    FRIDAY("Friday"),
    SATURDAY("Saturday");

    public String day;

    DayEnum(String day){
        this.day = day;
    }

    public String getDay() {
        return day;
    }
}
