package by.cdptr.les09.main;

public class ScienceFiction extends Book{
    
	private String theme;

	public ScienceFiction(int year, String name, int pages, String author, String theme) {
		super(year, name, pages, author);
	    this.theme= theme;
	}

}
