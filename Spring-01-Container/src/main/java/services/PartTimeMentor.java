package seivces;

import interfaces.Mentor;

public class PartTimeMentor implements Mentor {
    @Override
    public void createAccount() {
        System.out.println("part time mentor is created");
    }
}
