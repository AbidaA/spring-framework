package com.cybertek.services;

import com.cybertek.interfaces.ExtraSession;

public class ReviewSessions implements ExtraSession {
    @Override
    public int getHours() {
        return 6;
    }
}
