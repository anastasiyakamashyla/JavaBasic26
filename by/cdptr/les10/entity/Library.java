package by.cdptr.les10.entity;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Library {
   private List <Book> books;
   
   public Library ( ) {
	   books = new ArrayList<Book>();
   }
   public void addBook(Book newBook) {
	   books.add(newBook);
   }
   public boolean removeBook(Book book) {
	   return books.remove(book);
   }
   public List<Book> getBooks(){
	   return Collections.unmodifiableList(books); 
   }
   
   
}

