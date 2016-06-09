package khanh.demo.test;
import java.sql.SQLException;

import khanhnh.demo.dao.MovieDBInteract;

public class Main {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		MovieDBInteract mvi=new MovieDBInteract();
		mvi.QueryMovies("");
	}
}
