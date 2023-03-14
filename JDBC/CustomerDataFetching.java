package Batch3.JDBC;


	
		
		import java.sql.Connection;
		import java.sql.DriverManager;
		import java.sql.ResultSet;
		import java.sql.*;


		/**
		 * Hello world!
		 *
		 */
		public class CustomerDataFetching {

		
		    public static void main( String[] args )
		    {
		    	try{  
		    		Class.forName("com.mysql.jdbc.Driver");  
		    		Connection con=DriverManager.getConnection(  
		    		"jdbc:mysql://localhost:3306/sowjanya","root","pass@word1"); 
		    		
		    		Statement stmt=con.createStatement();  
		    		
		    		ResultSet rs=stmt.executeQuery("select * from customer"); 
		    		
		    		while(rs.next())  
		    		System.out.println(rs.getString(2)+"      "+rs.getString(3)+"     "+rs.getString(4)+"     "+rs.getString(5));  
		    		con.close();  
		    		}catch(Exception e){ System.out.println(e);}  
		    		}  
		    		}  
		        

	


