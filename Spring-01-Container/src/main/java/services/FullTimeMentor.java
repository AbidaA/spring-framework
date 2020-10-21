package seivces;

import interfaces.Mentor;

public class FullTimeMentor implements Mentor {
    @Override
    public void createAccount() {
        System.out.println("full time mentor is created");
    }
}
