package lab.com.bookutil;

import lab.Book;
import lab.Book.InvalidBookException;
import lab.BookStore;


public class Bookutil {
public static void main(String[] args) throws InvalidBookException{
	BookStore bs=new BookStore();
	Book b=new Book(456,"The christmas pig","J K rowling");
	Book b1=new Book(456,"David Copperfield","Charles Dickens");
	Book b2=new Book(456,"Never have I ever","Joshilyn Jackson");
	bs.addBook(b);
	bs.addBook(b1);
	bs.addBook(b2);
	bs.searchByTitle("The Christmas pig");
	bs.searchByAuthor("J K rowling");
	System.out.println(bs.a1);
}
}
