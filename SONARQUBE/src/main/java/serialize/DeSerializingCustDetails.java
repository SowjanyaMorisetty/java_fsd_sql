/**
 * 
 */
package serialize;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

/**
 * @author Administrator
 *
 */
public class DeSerializingCustDetails {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try
		{
			 
			  ObjectInputStream in=new ObjectInputStream(new FileInputStream("Documents"));  
			  SerializableDemo s=(SerializableDemo)in.readObject();  
			  System.out.println(s.getName()+" "+s.getAge()+""+s.getAddress()+""+s.getDesignation());  
			  in.close();  
			  }
	          catch(Exception e)
	          {
	        	  System.out.println(e);}    
            }  
}
   
			 
			 
	


