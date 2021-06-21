package jdbcdemo;
import java.sql.*;
public class Driver {
	public static void main(String args[]) {
		try {
			
			String Query="select * from crud";
			
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/hcl","root","Nandu@7401");
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery(Query);
			
			while(rs.next())
			{
				System.out.println(rs.getString("last_name")+", "+rs.getString("first_name"));
			}			
			
			}
		catch(Exception exc) {
			exc.printStackTrace();
			
		}
	}
}
   
