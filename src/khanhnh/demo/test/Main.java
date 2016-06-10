package khanhnh.demo.test;
import java.sql.SQLException;

import khanhnh.demo.dao.MovieDBInteract;
import khanhnh.demo.dao.MoviePersistor;
import khanhnh.demo.entities.Movie;

public class Main {
	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		//MovieDBInteract mvi=new MovieDBInteract();
		//mvi.QueryMovies("");
		
//		Movie mv=new Movie();
//		mv.setMovie_name("Prison Break");
//		mv.setDirector("Unknow");
//		mv.setDirector("Unknow");
//		mv.setDescription("Strategy Film");
//		mv.setYear_of_publishing(2010);
//		
		MoviePersistor mp=new MoviePersistor();
//		mp.PersistMovie(mv);
		//mp.FindMovie(1);
		mp.GetMovie(1);
		
		//MovieDBInteract mvi=new MovieDBInteract();
		//mvi.QueryMovies("");
	}
}
