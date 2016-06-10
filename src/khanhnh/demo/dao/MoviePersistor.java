package khanhnh.demo.dao;

import org.hibernate.Session;

import khanhnh.demo.dbhelper.HibernateUtils;
import khanhnh.demo.entities.Movie;

public class MoviePersistor {
	private HibernateUtils hu=new HibernateUtils();
	public void PersistMovie(Movie movie){
		Session session= hu.GetSessionFactory().getCurrentSession();
		session.beginTransaction();
		session.save(movie);
		session.getTransaction().commit();
	}
	
//	public void FindMovie(int movieid){
//		Session session= hu.GetSessionFactory().getCurrentSession();
//		session.beginTransaction();
//		Movie movie=(Movie)session.load(Movie.class, movieid);
//		System.out.println(movie.getMovie_name());
//		session.getTransaction().commit();
//	}
	
	public Movie GetMovie(int movieid){
		Session session= hu.GetSessionFactory().getCurrentSession();
		session.beginTransaction();
		Movie movie=(Movie)session.load(Movie.class, movieid);
		if(movie.getId()>0)
			System.out.println("Movie found !");
		session.getTransaction().commit();
		
		return movie;
	}
	
}
