package Controllers;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import Models.Movie;
import Models.Rating;
import Models.User;

public class API {
	
	private static final User Rating = null;
	private Map<Long,   User>   userIndex       = new HashMap<>();
	private Map<Long,   Movie>   MovieIndex       = new HashMap<>();
	private Map<Long,   Rating>   RatingIndex       = new HashMap<>();

	public API()
	  {}
	
	  public Collection<User> getUsers ()
	  {
	    return userIndex.values();
	  }
	  
	  public User addUser(String firstName, int age, String lastName,String gender,String occupation)
	  {
	    User user = new User (firstName, age,lastName, gender, occupation);
	    userIndex.put(user.id, user);
	    return user;
	  
	  }
	  
	  public  void deleteUsers() 
	  {
	    userIndex.clear();
	  }
	  
	  public Movie addMovie(String title, int year, String url)
	  {
	    Movie movie = new Movie (title,year,url);
	    MovieIndex.put(movie.id, movie);
	    return movie;
	  }
	  
	  public Rating addRating(long userID,long movieID,int rating)
	  {
	    Rating rating = new Rating (userID, movieID, rating);
	    RatingIndex.put(rating.id, rating);
	    return Rating;
	  }
	  
	  public User getMovie(String Movie) 
	  {
	    return MovieIndex.get(movie);
	  }
	  
	  public User getUserRatings(long id) 
	  {
	    return getUserRating.get(id);
	  }
	
	  
	  
	  
	  
}
