package CRUD_Operations;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class select_operation {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_Anu","root","Anu@sql123");
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("select * from employees");
			ResultSet rs1 = st.executeQuery("select count(*) from employees");
			while(rs.next())
			{
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getDouble(4));
				
			}
			con.close();
			}
			catch(Exception e)
			{
				System.out.println(e);
			}

	}

}
