package com.cybertek.services;

import com.cybertek.interfaces.Course;
import com.cybertek.interfaces.ExtraSession;

public class Java implements Course {

    OfficeHours officeHours;
//    ExtraSession extraSession; //***ExtraSessions is implemented by OfficeHours,
                               //***It is better practice to use extraHours, loosely coupled
ReviewSessions reviewSessions;

    public Java(OfficeHours officeHours, ReviewSessions reviewSessions) {
        this.officeHours = officeHours;
        this.reviewSessions = reviewSessions;
    }

//    public Java(ExtraSession extraSession) {
//        this.extraSession = extraSession;
//    }

//    public Java(OfficeHours officeHours) {
//        this.officeHours = officeHours;
//    }

    public void getTeachingHours() {
        System.out.println("Weekly teaching hours: " + (20+ officeHours.getHours()+reviewSessions.getHours()));
    }
}
