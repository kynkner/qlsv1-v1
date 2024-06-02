package context;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBContext {
	public Connection getConnection()throws Exception {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/qlsv";
			String user="root";
			String password ="Nguloz.123";
			return DriverManager.getConnection(url,user,password);
		} catch (ClassNotFoundException | SQLException e) {
			return null;
		} 
	}
}
