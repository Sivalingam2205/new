package day2_objects;

public class UseStudent {
	public static void main(String[] args) {
		Student student1 = new Student();
		student1.studentName = "SIVA";
		student1.studentSection = 'b';
		student1.studentRollNumber = 12;
		student1.tamilMark = 60;
		student1.englishMark = 70;
		student1.mathsMark = 65;
		student1.physicsMark = 90;
		student1.chemistryMark = 55;
		student1.biologyMark = 65;
		student1.totalMark = student1.tamilMark+student1.englishMark+student1.mathsMark+student1.physicsMark+student1.chemistryMark+student1.biologyMark;
		student1.average = student1.totalMark/6;
		System.out.println("Name="+student1.studentName+" Average="+student1.average);
		
		
		
		
		
	}

}
