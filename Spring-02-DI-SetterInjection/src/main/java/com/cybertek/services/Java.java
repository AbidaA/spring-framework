package com.cybertek.services;

import com.cybertek.interfaces.Course;

public class Java implements Course {

private OfficeHours officeHours;

    public void setOfficeHours(OfficeHours officeHours) {
        this.officeHours = officeHours;
    }

    public void getTeachingHours() {
        System.out.println("Weekly teaching hours: " + (20+ officeHours.getHours()));
    }
}
