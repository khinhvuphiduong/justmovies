package khanhnh.demo.entities;

public class Movie {
	private int id=0;
	private String movie_name="";
	private String main_actor="";
	private int year_of_publishing;
	private String description;
	
	public int getId() {
		return id;
	}
	public String getMovieName() {
		return movie_name;
	}
	public void setMovieName(String movie_name) {
		this.movie_name = movie_name;
	}
	public String getMainActor() {
		return main_actor;
	}
	public void setMainActor(String main_actor) {
		this.main_actor = main_actor;
	}
	public int getYearOfPublishing() {
		return year_of_publishing;
	}
	public void setYearOfPublishing(int year_of_publishing) {
		this.year_of_publishing = year_of_publishing;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

}
