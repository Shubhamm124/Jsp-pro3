package app3code;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Customer {

	public int insertOpr(String custname, String custaddr, String custmobno, String custemail) {
		int status = 0;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/customer", "root", "root");

			java.sql.Statement stmt = con.createStatement();

//			ResultSet rs = stmt.executeQuery("select * from custtable");
			String query = "insert into custtable values('" + custname + "','" + custaddr + "','" + custmobno + "','"
					+ custemail + "')";

			System.out.println("Insert Query is: " + query);

			status = stmt.executeUpdate(query);
			

		} catch (Exception e) {
			System.out.println(e);
		}
		return status;

	}

	public ResultSet searchOpr(String name) {
		ResultSet rs = null;

		try {
			System.out.println("name is " + name);
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/customer", "root", "root");

			Statement stmt = (Statement) con.createStatement();

			rs = ((java.sql.Statement) stmt).executeQuery("select * from custtable where custname='" + name + "'");

		} catch (Exception e) {
			System.out.println(e);
		}
		return rs;

	}

}
