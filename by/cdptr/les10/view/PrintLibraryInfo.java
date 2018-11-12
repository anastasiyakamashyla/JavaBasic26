package by.cdptr.les10.view;

import java.util.List;

import by.cdptr.les10.entity.Book;
import by.cdptr.les10.entity.Novel;



public class PrintLibraryInfo {
public static void printAsTable(List<Book> books, String message) {
	System.out.println(message);
	if(books == null || books.isEmpty()) {
		System.out.println("There is no books to print");
	} else {
		String line = "-----------------------------------------------";
		System.out.println("Title\t\t|Author\t\t|Price\t|LoveHero");
		System.out.println(line);
		for(Book b: books) {
			System.out.print(b.getTitle() + "\t|" + b.getAuthor() + "\t\t|" + b.getPrice() + "\t|") ;
			if(b instanceof Novel) {
				System.out.print( ((Novel)b).getLoveHero());
			}
			System.out.println();
			System.out.println(line);
		}
	}
}
public static void printAsList(List<Book> books, String message) {
	System.out.println(message);
	if(books == null || books.isEmpty()) {
		System.out.println("There is no books to print");
	} else {
		for(Book b: books) {
			System.out.println(b);
		}
	}
}
public static void print(Book book, String message) {
	System.out.println(message);
	if(book == null) {
		System.out.println("Book has not found");
	} else {
		System.out.println(book);
	}
}
}
