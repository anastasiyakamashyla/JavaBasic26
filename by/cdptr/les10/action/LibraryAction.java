package by.cdptr.les10.action;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import by.cdptr.les10.entity.Book;
import by.cdptr.les10.entity.Library;


public class LibraryAction {
	public void addNewBook(Book book, Library library) {
		if (validation(book, library)) {
			library.addBook(book);
		}
	}

	public void addNewBooks(List<Book> books, Library library) {
		for (Book el : books) {
			if (validation(el, library)) {
				library.addBook(el);
			}
		}
	}

	public boolean validation(Book book, Library library) {
		boolean validationPass;
		if (library != null && book != null && book.getTitle() != null && !"".equals(book.getTitle().trim())) {
			validationPass = true;
		} else {
			System.out.println("Lib null or book null or Title null");
			validationPass = false;
		}

		return validationPass;
	}

	public void removeBook(Book book, Library library) {
		if (validation(book, library)) {
			library.removeBook(book);
		}
	}

	public void removeBookbyTitle(Book book, Library library) {

		if (validation(book, library)) {
			List<Book> books = library.getBooks();
			for (Book el : books) {
				if (book.getTitle().equals(el.getTitle())) {
					library.removeBook(el);
					break; 
				}
				
			}
		}
	}

	public Book find(Book bookToFind, Library library) {
		List<Book> books = library.getBooks();
		if (validation(bookToFind, library)) {
		for (Book el: books) {
			if (bookToFind.equals(el)) {
				return el;
			}
		}}
		System.out.println("Book isn't found: " + bookToFind);
		return null;
	}

	public List<Book> find(String author, Comparator<Book> comparator, Library library) {
		if(author == null || "".equals(author.trim()) || library == null) {
			System.out.println("author is null or lib is null");
			return null;
		}
		List<Book> booksByAuthor = new ArrayList<Book>();
		List<Book> booksInLib = library.getBooks();
		for(Book el : booksInLib) {
			if(author.equals(el.getAuthor())) {
				booksByAuthor.add(el);
			}
		}
		
		Collections.sort(booksByAuthor, comparator);
		return booksByAuthor;
	}
}
