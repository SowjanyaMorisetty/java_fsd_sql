package batch3.DI_SetterInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext("aplicationContext.xml");
    	Roles r =(Roles) context.getBean("role",Roles.class);
    	Roles r1 =(Roles) context.getBean("role1",Roles.class);

    	
    	r.display();
    	r1.display();
    	
    	
    }
}
