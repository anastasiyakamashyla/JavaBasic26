package by.cdptr.les09.main;

public class Novel extends Book {
  protected String lovehero;
  
  public Novel (int year, String name, int pages, String author, String lovehero) {
	  super (year,name,pages, author);
	  this.lovehero = lovehero;
  }
}
