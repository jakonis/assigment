package Controllers;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import Models.User;

public class API {
	
	private Map<Long,   User>   userIndex       = new HashMap<>();

	public API()
	  {}
	
	  public Collection<User> getUsers ()
	  {
	    return userIndex.values();
	  }
	  
	  public User addUser(String firstName, String lastName, String occupation, String gender , int age) 
	  {
	    User user = new User (firstName, lastName, occupation , gender,age);
	    userIndex.put(user.id, user);
	    return user;
	  
	  }
	  
	  public  void deleteUsers() 
	  {
	    userIndex.clear();
	  }
	  
	  public User addMovie(String title, String url , int year) 
	  {
	    Movie movie = new Movie (title, url, url, url, year);
	    userIndex.put(movie.id, movie);
	    return movie;
	  }
	  
	  public User addRating(String userID, String movieID , int rating) 
	  {
	    Rating rating = new Movie (userID, movieID, rating);
	    userIndex.put(rating.id, rating);
	    return rating;
	  }
	  
	  public User getMovie(String Movie) 
	  {
	    return movieIndex.get(movie);
	  }
	  
	  public User getUserRatings(long id) 
	  {
	    return getUserRatings.get(id);
	  }
	
	  
	  
	  
	  
}
