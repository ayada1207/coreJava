import java.sql.*;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;


public class jdbcMain {

	public static void main(String[] args) {
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");  //class that connect to jdbc	
			Connection con =
					DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe",
							"SYSTEM", "oracle");    // for connecting to dataBase with user name/password
			Statement smt = con.createStatement();
			ResultSet result = smt.executeQuery("SELECT * FROM TABLE_NAME");
			
			while(result.next()) {
				System.out.println(result.getInt(1)  + " " + result.getString(2));
			}
			
		}catch(ClassNotFoundException e){
			e.printStackTrace();
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		

	}

}
