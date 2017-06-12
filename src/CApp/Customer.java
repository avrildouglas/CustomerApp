//Author: Avril Douglas
//Date" June 12, 2017

package CApp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;


public class Customer {
	
	static Scanner keyboard = new Scanner(System.in);
	
	static String cLName, result;
	
	public static void main(String[] args){
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		String sql= "select CustomerID, Title, FullName, StreetAddress, City, "
				+ "State, ZipCode, EmailAddress, `Position` from mycustomers";
		
		
		System.out.println("Please enter the customer last name: ");
		cLName = keyboard.nextLine();
		result = FindCustomer(cLName);		
	}

	
	public static String FindCustomer(cLName){
		
		try{
			
		   con = DriverManager.getConnection("jdbc:mysql://localhost/mycustomers?"
				   + "user=root&password=password"+ "user=root&password=password");

           stmt = con.prepareStatement();  
           rs = stmt.executeQuery(sql + "where LastName = clName");
           while(rs.next()){
        	   System.outprintln

            
     
           
            //Add Education to table
            stmtResume = conResume.prepareStatement(updEducation);
           

			
			
			
			
			
		}
	}catch
	
	}

//********************


}           catch  (SQLException e) {
    e.printStackTrace();
}
finally{

try{
    rsApplicant.close();
    rsEducation.close();
    rsExperience.close();
    rsSkills.close();
}catch(SQLException e){
    e.printStackTrace();
}             

}

}
	
		
	
	

}
