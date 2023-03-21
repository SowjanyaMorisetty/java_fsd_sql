package serialize;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SerializingCustDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		 try{    
			  //Creating the object    
			  SerializableDemo s1 =new  SerializableDemo("sowjanya",21,"hyderabad","software engineer");    
			  //Creating stream and writing the object    
			  FileOutputStream fout=new FileOutputStream("Documents");    
			  ObjectOutputStream out=new ObjectOutputStream(fout);    
			  out.writeObject(s1);    
			  out.flush();    
			  //closing the stream    
			  out.close();    
			  System.out.println(s1.getName()+"  "+s1.getAge()+"  "+s1.getAddress()+"  "+s1.getDesignation());    
			  }
		     catch(Exception e){System.out.println(e);}    
			 }    
			    
	}


