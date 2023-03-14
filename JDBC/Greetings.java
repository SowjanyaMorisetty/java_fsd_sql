package Batch3.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Greetings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try{  
    		Class.forName("com.mysql.jdbc.Driver");  
    		Connection con=DriverManager.getConnection(  
    		"jdbc:mysql://localhost:3306/sowjanya","root","pass@word1"); 
    		
    		Statement stmt=con.createStatement();  
    		
    		ResultSet r=stmt.executeQuery("Create table greet(greet1 varchar(8),greet2 varchar(5),repeat int(3))"+
    		                                "insert into greet values(hi,hello,2)"); 
    		
    		
    		
    		while(r.next())  
    		System.out.println(r.getString(1)+"      "+r.getString(2)+"     "+r.getInt(3));  
    		con.close();  
    		}catch(Exception e){ System.out.println(e);}  
    		} 
	}


