//Author: Avril Douglas
//Date" June 12, 2017

package CApp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import java.sql.PreparedStatement;


public class Customer {
	
	public static void main(String[] args){

		String cLName, result;
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Please enter the customer last name: ");
		cLName = keyboard.nextLine();
		getCustomer(cLName);
	}
	
	public static void getCustomer(String cLName){
		Connection con = null;
		Statement stmt = null;
		PreparedStatement pstmt = null;
		ResultSet rst = null;
		String sql= "select * from mycustomers where LastName ='"+ cLName + "'";
		 
		try{			
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost/customers?"+
			"user=root&password=password");
           pstmt = con.prepareStatement(sql); 
           rst=pstmt.executeQuery();
          
           while (rst.next()) {
            	System.out.print("Customer Number: " + rst.getString("CustomerID") + "\n");
            	System.out.print(rst.getString("Title") + " ");
            	System.out.print(rst.getString("FullName") + "\n");
               	System.out.print(rst.getString("StreetAddress") + "\n");
            	System.out.print(rst.getString("City") + ", " +  rst.getString("State") + " "+ rst.getString("Zipcode") + "\t\n");
            	System.out.print(rst.getString("EmailAddress") + "\n");
            	System.out.print(rst.getString("Position") + " at " + rst.getString("Company") + "\t"); 
         //   	System.out.print(rst.getString("Press (1) to search for another customer or press 2 to Edit the customer"+"\'s"+ "address.");              
         //   	return;
           }
			}catch (SQLException e){
		
		} catch (ClassNotFoundException e) {
				e.printStackTrace();
		} finally {
				try {
					rst.close();
					pstmt.close();
					con.close();
				}catch(SQLException e){
					e.printStackTrace();
				
				}
		}
	}

}
				