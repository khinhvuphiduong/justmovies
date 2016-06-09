package khanh.demo.test;
import java.sql.Connection;
import java.sql.SQLException;

import khanhnh.demo.dbhelper.DatabaseConnection;

public class Main {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		DatabaseConnection dbc=new DatabaseConnection();
		Connection cn=dbc.GetConnection();
		if(!cn.isClosed())
			System.out.println("OK");
		cn.close();
	}

}
