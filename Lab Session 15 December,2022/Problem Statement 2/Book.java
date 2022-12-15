package lab;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

public class Book //book class
{
	public static final Collection<? extends String> Book = null;
	int bookId;//instance variable
	String title, author;
	public class InvalidBookException extends Exception { //created a custom exception 
		
	}
	public Book(int bookId, String title, String author) throws InvalidBookException  {//constructor
		this.bookId=bookId;
		this.title=title;
		this.author=author;
}}
	
