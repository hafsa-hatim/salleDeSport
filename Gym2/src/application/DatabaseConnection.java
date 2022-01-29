package application;
import java.sql.*;
import java.sql.DriverManager;
import java.sql.Connection;

public class DatabaseConnection {
	
	 public Connection databaseLink;
	
		 public Connection getConnection() {
		    String databaseName = "GYM01";
            String databaseUser = "root";
		    String databasePassword = "Bullshit123!";
            String url = "jdbc:mysql://localhost:3306/"+databaseName+"?autoReconnect=true&useSSL=false&characterEncoding=utf8";
     //jdbc:mysql://localhost:3306/"+databaseName+"?autoReconnect=true&useSSL=false";
		    
		    
		   try {
			   Class.forName("com.mysql.cj.jbdc.Driver");
			   databaseLink =  DriverManager.getConnection(url,databaseUser,databasePassword);
		   }catch (Exception e) {
			   e.printStackTrace();
			   e.getCause();
		   }
		   return databaseLink;
		  
		   

	

}
}
