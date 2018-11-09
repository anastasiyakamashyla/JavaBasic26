package by.cdptr.les06.main;

public class Student {
	private String name;
    int [] marks;
    //private String surname;
    //private int numbergroup;
    
    public Student (String name, int [] marks) {
    	this.name = name;
    	this.marks = marks;
     }
    public String getName () {
    	return name;
    }
    public int [] getMarks () {
    	return marks;
    }
    
    
}
