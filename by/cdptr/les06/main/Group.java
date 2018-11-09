package by.cdptr.les06.main;

public class Group {
 private Student [] students;
 private int index;
 public Group (int countOfStudents) {
	 students = new Student [countOfStudents];
	 index = 0;
	 
 }
 public void addStudent (Student st) {
	 if(index >= students.length) {
		 return;
	 }
	 students [index] = st;
	 index++;
 }
 public Student [] getStudents ( ) {
	 return students;
 }
}
