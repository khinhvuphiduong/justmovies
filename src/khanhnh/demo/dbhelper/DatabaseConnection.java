package khanhnh.demo.dbhelper;

import java.sql.*;

public class DatabaseConnection {
	private String url="jdbc:mysql://222.252.17.192:3306/JustMovies";
	private  String driverClass="com.mysql.jdbc.Driver";
	private String username="khanhnh";
	private String password="khanhlaso1";
	private Connection connection=null;
	
	public Connection GetConnection(){
		try{
			Class.forName(driverClass).newInstance();
			connection=DriverManager.getConnection(url, username, password);
		}
		catch(Exception ex){
			System.err.println(ex.getMessage());
		}
		
		return connection;
	}
	
	public void CloseConnection(){
		try{
			if(!connection.isClosed())
				connection.close();
		}
		catch(Exception ex){
			System.err.println(ex.getMessage());
		}
	}
}
