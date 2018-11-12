package by.cdptr.les09.main;

public class Magazine extends PrintEdition{

	private String month;

	public Magazine(int year, String name, int pages, String month) {
		super(year, name, pages);
		this.month=month;
	}

}
