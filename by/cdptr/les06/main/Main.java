package by.cdptr.les06.main;

public class Main {
	public static void main (String [] args) {
		Student st = new Student ("Vasya", new int [] {3,4,5,6,7});
		 Group group = new Group (4);
		 group.addStudent (st);
		 group.addStudent (new Student ("Kolya", new int [] {9,10,9,8,9}));
		 group.addStudent (new Student ("Nikita", new int [] {1,2,2,9,9}));
		 group.addStudent (new Student ("Masha", new int [] {3,8,5,8,2}));
		 GroupLogic grLogic = new GroupLogic ();
		 double avrMarkInGroup = grLogic.avrMarkInGroup(group);
		 System.out.println ("avrMarkInGroup: " + avrMarkInGroup);
		 /*int studentsHigh = grLogic.studentsHigh(group);
		 System.out.println ("studentsHigh: " + studentsHigh);
		 int studentsLow = grLogic.studentsLow(group);
		 System.out.println ("studentsLow: " + studentsLow);
		*/
	}
 
}
