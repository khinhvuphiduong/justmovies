package khanhnh.demo.dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import khanhnh.demo.dbhelper.DatabaseConnection;
public class MoveDBInteract {
	private String insertSQL="insert into movies values(?,?,?,?)";
	private String selectSQL="select * from movies";
	public void CreateMovie(String name, String director, String mainactor, int publishyear){
		try {
			DatabaseConnection dbc=new DatabaseConnection();
			PreparedStatement pst=dbc.GetConnection().prepareStatement(insertSQL);
			pst.setString(1, name);
			pst.setString(2, director);
			pst.setString(3, mainactor);
			pst.setInt(4, publishyear);
			
			pst.execute();
			System.out.println("Insert Movie Done !");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
