package by.cdptr.les10.main;

import java.util.Comparator;
import java.util.List;

import by.cdptr.les10.action.BookPriceComparator;
import by.cdptr.les10.action.LibraryAction;
import by.cdptr.les10.entity.Book;
import by.cdptr.les10.entity.Library;
import by.cdptr.les10.file.BookCreator;
import by.cdptr.les10.file.BookType;
import by.cdptr.les10.view.PrintLibraryInfo;



public class Main {
	public static void main(String[] args) {
		Library myLibrary = new Library();
		LibraryAction libAction = new LibraryAction();
		PrintLibraryInfo.printAsList(myLibrary.getBooks(),"\nMy Library:");
		libAction.addNewBook (new Book("1", "1"), myLibrary);	
		libAction.addNewBook (new Book("2", "2"), myLibrary);
		libAction.addNewBook (new Book("3", "3"), myLibrary);
		libAction.addNewBook (new Book("4", "4"), myLibrary);
		PrintLibraryInfo.printAsList(myLibrary.getBooks(),"\nMy Library:");
		System.out.println("\nTry to remove book with null fields: ");
		libAction.removeBook(new Book(null, null), myLibrary);
		libAction.removeBook(new Book("3", "3"), myLibrary);
		PrintLibraryInfo.printAsList(myLibrary.getBooks(),"\nMy Library after call removeBook 3:");
		libAction.removeBookbyTitle(new Book("4", null), myLibrary);
		PrintLibraryInfo.printAsList(myLibrary.getBooks(),"\nMy Library after call removeBookbyTitle 4:");
		
		
		List<Book> allBooksInFileBooks = BookCreator.readBooks(BookType.BOOK);
		libAction.addNewBooks(allBooksInFileBooks, myLibrary);
		
		List<Book> allBooksInFileNovels = BookCreator.readBooks(BookType.NOVEL);
		libAction.addNewBooks(allBooksInFileNovels, myLibrary);
		
		PrintLibraryInfo.printAsList(myLibrary.getBooks(),"\nMy Library");
		
		Book bookFind = libAction.find(new Book("1", "1"), myLibrary);
		System.out.println("\nfind 1 book: " + bookFind);
		
		Comparator<Book> priceComparator = new BookPriceComparator();
		List<Book> booksByAuthor = libAction.find("A1", priceComparator, myLibrary);
		PrintLibraryInfo.printAsTable(booksByAuthor,"\nFind A1 and sort by price");
		
		
	}

}
