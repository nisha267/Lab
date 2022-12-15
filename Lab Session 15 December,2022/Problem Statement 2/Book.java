package lab;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

public class Book 
{
	public static final Collection<? extends String> Book = null;
	int bookId;//instance variable
	String title, author;
	public class InvalidBookException extends Exception { //created a custom exception 
		
	}
	public Book(int bookId, String title, String author) throws InvalidBookException  {
		this.bookId=bookId;
		this.title=title;
		this.author=author;
}
	class BookStore {
	List<String> a1= new ArrayList<String>(); //creating list
		void addBook(Book b) {
			a1.addAll(Book); // book details
		}
		void searchByTitle(String title)  {
			if (a1.contains(title)) {
				System.out.println(a1.containsAll(Book));
			} else 
				System.out.println("Book NOT found");
		}
		void searchByAuthor(String author) {
			if(a1.contains(author)) {
				System.out.println(a1.containsAll(Book));
			}else 
				System.out.println("Book Not Found");
		}
	}
}