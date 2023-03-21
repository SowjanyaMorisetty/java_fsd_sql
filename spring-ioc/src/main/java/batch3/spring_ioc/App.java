package batch3.spring_ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");  
    	System.out.println("application is loaded ...........");
    	SIM s =(SIM) context.getBean("sim");
    	s.calling();
    	s.dialing();
        
    }
}
