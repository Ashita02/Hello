package quesBank3;

import java.util.HashMap;
import java.util.Map;

public class MovieLibrary {
	private Map<String, Integer> movieMap = new HashMap<>();
	public void addMovie(String movieName, int availTickets) {
		movieMap.put(movieName, availTickets);
	}
	public int getAvailTickets(String movieName) {
		return movieMap.getOrDefault(movieName, 0);
	}
	public void setAvailTickets(String movieName,  int availTickets) {
		movieMap.put(movieName, availTickets);
	}
	public void setAllMovies(Map<String, Integer> movies) {
		movieMap = new HashMap<>(movies);
	}
	public void printMovieLibrary() {
		for(Map.Entry<String, Integer> entry : movieMap.entrySet()) {
			System.out.println("Movie : "+entry.getKey()+"Available tickets : " + entry.getValue());
		}
	}
	
	public static void main(String[] args) {
		MovieLibrary library = new MovieLibrary ();
		library.addMovie("Hero", 50);
		library.addMovie("Coolie", 100);
		System.out.println("Movies in library : ");
		library.printMovieLibrary();
		System.out.println("Available tickets for Hero :" + library.getAvailTickets("Hero"));
		library.setAvailTickets("Hero", 30);
		System.out.println("Updated avail tickets for hero : " + library.getAvailTickets("Hero"));
	}

}
