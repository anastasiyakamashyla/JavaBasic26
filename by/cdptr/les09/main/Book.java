package by.cdptr.les09.main;

public class Book extends PrintEdition{
  protected String author;

public Book(int year, String name, int pages, String author) {
	super(year, name, pages);
	this.author = author;
}
  
  
}
