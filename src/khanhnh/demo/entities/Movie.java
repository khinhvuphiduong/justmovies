package khanhnh.demo.entities;

import javax.persistence.Entity;

@Entity
public class Movie {
	private int id;
	private String movie_name;
	private String main_actor;
	private String director;
	private int year_of_publishing;
	private String description;
	
	public Movie(){
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMovie_name() {
		return movie_name;
	}

	public void setMovie_name(String movie_name) {
		this.movie_name = movie_name;
	}

	public String getMain_actor() {
		return main_actor;
	}

	public void setMain_actor(String main_actor) {
		this.main_actor = main_actor;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public int getYear_of_publishing() {
		return year_of_publishing;
	}

	public void setYear_of_publishing(int year_of_publishing) {
		this.year_of_publishing = year_of_publishing;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
}
