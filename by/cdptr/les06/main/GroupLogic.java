package by.cdptr.les06.main;

public class GroupLogic {
	public double avrStudentMark(Student st) {
		int[] marks = st.getMarks();
		int sum = 0;
		for (int el : marks) {
			sum += el;
		}

		double avrStudentMark = sum / marks.length;
		return avrStudentMark;
	}

	public double avrMarkInGroup(Group gr) {
		Student[] students = gr.getStudents();
		double sum = 0;
		for (Student el : students) {
			double avrStudentMark = avrStudentMark(el);
			sum += avrStudentMark;
			System.out.println("name: " + el.getName() + " avrStudentMark: " + avrStudentMark);
		}
		double avrMarkInGroup = sum / students.length;
		return avrMarkInGroup;
	}

	public int studentsHigh(Group gr) {
		int counter = 0;
		Student[] students = gr.getStudents();
		for (Student el : students) {
			double avrStudentMark = avrStudentMark(el);
			if (avrStudentMark >= 7) {
				counter++;
			}
		}
		return counter;
	}

	public int studentsLow(Group gr) {
		int counter = 0;
		Student[] students = gr.getStudents();
		for (Student el : students) {
			int[] marks = el.getMarks();
			for (int m : marks) {
				if (m == 2 ) {
					counter++;
					break;
				}
			}
			
		}
		return counter;
	}
}
