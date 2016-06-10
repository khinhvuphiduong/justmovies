package khanhnh.demo.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.Statement;

import khanhnh.demo.dbhelper.DatabaseConnection;
import khanhnh.demo.entities.Movie;
public class MovieDBInteract {
	private String insertSQL="insert into movies values(?,?,?,?,?)";
	private String selectSQL="select * from movies where ";
	private DatabaseConnection dbc;
	private MoviePersistor mp;
	public MovieDBInteract(){
		dbc=new DatabaseConnection();
		mp=new MoviePersistor();
	}
	public void CreateMovie(String name, String director, String mainactor, int publishyear, String description){
		try {
			PreparedStatement pst=dbc.GetConnection().prepareStatement(insertSQL);
			pst.setString(1, name);
			pst.setString(2, director);
			pst.setString(3, mainactor);
			pst.setInt(4, publishyear);
			pst.setString(5, description);
			
			pst.execute();
			System.out.println("Insert Movie Done !");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
		finally {
			dbc.CloseConnection();
		}
	}
	
	public void CreateMovie(Movie movie){
		mp.PersistMovie(movie);
	}
	
	public void QueryMovies(String searchtext){
		try{
			selectSQL+="movie_name like '%"+searchtext+"%' or "
						+"main_actor like '%"+searchtext+"%' or "
						+"year_of_publishing like '%"+searchtext+"%' or "
						+"director like '%"+searchtext+"%' or "
						+"description like '%"+searchtext+"%'";
			java.sql.Statement st=dbc.GetConnection().createStatement();
			ResultSet rs=st.executeQuery(selectSQL);
			while(rs.next()){
				System.out.println("Movie Found With ID " + rs.getInt("id"));
				System.out.println("Title: " + rs.getString("movie_name"));
			}
		}
		catch(Exception ex){
			System.err.println(selectSQL);
			ex.printStackTrace();
		}
		finally{
			dbc.CloseConnection();
		}
	}
}
