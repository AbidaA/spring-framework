import interfaces.Mentor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import services.FullTimeMentor;
import sun.management.snmp.jvmmib.JVM_MANAGEMENT_MIBOidTable;

import java.applet.AppletContext;

public class CybertekApp {
    public static void main(String[] args) {
        ApplicationContext container = new ClassPathXmlApplicationContext("config.xml");
        Mentor mentor = (Mentor)container.getBean("fullTimeMentor");
        mentor.createAccount();

        Mentor mentor1 = (Mentor)container.getBean("partTimeMentor");
        mentor1.createAccount();


    }
}
