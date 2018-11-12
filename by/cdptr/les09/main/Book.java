package by.cdptr.les09.main;

import by.cdptr.les09.main.PrintEdition;

public class Book extends PrintEdition{
  protected String author;

public Book(int year, String name, int pages, String author) {
	super(year, name, pages);
	this.author = author;
}
  
  
}
