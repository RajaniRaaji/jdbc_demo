package jdbcdemo3;
import java.sql.*;
import java.sql.DriverManager;
import java.sql.Statement;
public class Driver3 {
	public static void main(String args[]) {
		String url="jdbc:mysql://localhost:3306/hcl";
		String user="root";
		String password="Nandu@7401";
		
		try {
			
			Connection con=DriverManager.getConnection(url,user,password);
			Statement st=con.createStatement();
			
			//String sql="update crud" + "set address='us' " + "where last_name=raaji";
			
			String sql="delete from crud where sno=4";
			int rowsAffected=st.executeUpdate(sql);
		    System.out.println("Rows affected " +rowsAffected);
			
		    
		  }
		catch (Exception exc) {
			exc.printStackTrace();
		}
		
	}
}

