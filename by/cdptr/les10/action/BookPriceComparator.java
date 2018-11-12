package by.cdptr.les10.action;

import java.util.Comparator;

import by.cdptr.les10.entity.Book;



public class BookPriceComparator implements Comparator<Book> {
	public int compare(Book o1, Book o2) {
		double price1 = o1.getPrice();
		double price2 = o2.getPrice();
		if (price1 < price2) {
			return -1;
		} else if (price1 == price2) {
			return 0;
		} else {
			return 1;
		}
	}
}