package com.cybertek.services;

import com.cybertek.interfaces.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Java implements Course {

    //field injection
    @Autowired
    private OfficeHours officeHours;

//
//    //Constructor injection
//    @Autowired
//    public Java(OfficeHours officeHours) {
//        this.officeHours = officeHours;
//    }

////    Setter Injection --> not commonly used
//
//@Autowired
//    public void setOfficeHours(OfficeHours officeHours) {
//        this.officeHours = officeHours;
//    }

    public void getTeachingHours() {
        System.out.println("weekly teaching hours is " + (20 + officeHours.getExtraHours()));
    }
}
