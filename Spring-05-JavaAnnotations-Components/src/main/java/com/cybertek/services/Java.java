package com.cybertek.services;

import com.cybertek.interfaces.Course;
import org.springframework.stereotype.Component;

@Component
public class Java implements Course {
    public void getTeachingHours() {
        System.out.println("weekly teaching hours is 20 hours");
    }
}
