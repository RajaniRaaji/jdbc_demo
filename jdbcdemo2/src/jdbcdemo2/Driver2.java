package jdbcdemo2;
import java.sql.*;
public class Driver2 {
	public static void main(String args[]) {
		
		try {
			
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/hcl","root","Nandu@7401");
			Statement st=con.createStatement();
			
			String sql="insert into crud"+"(sno,last_name,first_name,address)"+"values(4,'bindu','sree','mpl')";
		    
		    st.executeUpdate(sql);
		    System.out.println("insertion completed");
		    
			
		}
		catch (Exception exc) {
			exc.printStackTrace();
		}
		
	}
}


