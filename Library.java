package quesBank3;

import java.util.Map;

class Library{
	private int no_of_books;
	private String name;
	private Map<String, Integer> bookGenres;
	public int getNo_of_books(int no_of_books){
		return no_of_books;
		}
	public void setNo_of_books(int no_of_books) {
		this.no_of_books = no_of_books;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Map<String, Integer> getBookGenres(){
		return bookGenres;
	}
	public void setBookGenres(Map<String,Integer> bookGenres) {
		this.bookGenres = bookGenres;
	}
	public void addBook(String genre) {
		if(bookGenres.containsKey(genre)) {
			bookGenres.put(genre,  bookGenres.get(genre)+1);
		}else {
			bookGenres.put(genre, 1);
		}
		no_of_books++;
	}
	public int searchBooks(String genre) {
		if(bookGenres.containsKey(genre)) {
			return bookGenre.get(genre);
		}else {
			return 0;
		}
	}
	}
public class Library {

}
