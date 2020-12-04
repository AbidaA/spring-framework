package com.cybertek.services;

import com.cybertek.interfaces.ExtraHours;
import com.cybertek.interfaces.ExtraSession;
import org.springframework.stereotype.Component;

@Component
public class OfficeHours implements ExtraHours {

    @Override
    public int getExtraHours() {
        return 4;
    }
}
