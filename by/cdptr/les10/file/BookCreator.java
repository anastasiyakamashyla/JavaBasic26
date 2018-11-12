package by.cdptr.les10.file;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import by.cdptr.les10.entity.Book;
import by.cdptr.les10.entity.Novel;



public class BookCreator {
	
	public static List<Book> readBooks(BookType bookType) {
		List<String> lines = ScannerReadFile.read(bookType.getFilePath());
		List<Book> allBooksInFile = new ArrayList<>();
		for(String line : lines) { 
			String[] oneLineArray= line.split(",");
			List<String> oneLineList = Arrays.asList(oneLineArray);
			Book book = createBook(oneLineList, bookType);
			allBooksInFile.add(book);
		}
		return allBooksInFile;
	}
	
	private static Book createBook(List<String> fieldsInOneLine, BookType bookType) {
		if(bookType.equals(BookType.BOOK) && fieldsInOneLine.size() != 3 
				|| bookType.equals(BookType.NOVEL) && fieldsInOneLine.size() != 4 
				) {
			System.out.println("Something wrong with fileFormat");
			return null;			
		}
		String title = fieldsInOneLine.get(0);
		String author = fieldsInOneLine.get(1);
		String priceString = fieldsInOneLine.get(2);
		double price = priceString == null ?  0 : Double.valueOf(priceString);
		Book book = null;
		if(bookType.equals(BookType.BOOK)) {
			book = new Book(title, author, price);
		} else if(bookType.equals(BookType.NOVEL)) {
			String loveHero = fieldsInOneLine.get(3);
			book = new Novel(title, author, price, loveHero);
		}
		return book;
	}

}
