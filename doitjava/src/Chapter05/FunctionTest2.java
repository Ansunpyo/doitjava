package Chapter05;

import java.util.Scanner;

public class FunctionTest2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Student kim = new Student();
		Student seo = new Student();
		
		System.out.println(kim == seo);
		
		
		kim.studentID = 202001001;
		kim.studentName = "������";
		kim.grade = 3;
		kim.address = "����";
		
		kim.showStudentInfo();

		seo.studentID = 202001002;
		seo.studentName = "������";
		seo.grade = 1;
		seo.address = "����";

		seo.showStudentInfo();
		
		Student jo = new Student();
		jo.studentID = 202001003;
	}

}
