package lab;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class BookStore {public static final Collection<? extends String> Book = null;
//class bookstore
	public List<String> a1= new ArrayList<String>(); //creating list
		public void addBook(Book b) {//method 1
			a1.addAll(Book); // book details
		}
		public void searchByTitle(String title)  {//method 2
			if (a1.contains(title)) {
				System.out.println(a1.containsAll(Book));
			} else 
				System.out.println("Book NOT found");
		}
		public void searchByAuthor(String author) {//method author name
			if(a1.contains(author)) {
				System.out.println(a1.containsAll(Book));
			}else 
				System.out.println("Book Not Found");
		}
	}
