package Chapter05;

import java.util.Scanner;

public class FunctionTest2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Student kim = new Student();
		Student seo = new Student();
		
		System.out.println(kim == seo);
		
		
		kim.studentID = 202001001;
		kim.studentName = "김유신";
		kim.grade = 3;
		kim.address = "경주";
		
		kim.showStudentInfo();

		seo.studentID = 202001002;
		seo.studentName = "서유진";
		seo.grade = 1;
		seo.address = "서울";

		seo.showStudentInfo();
		
		Student jo = new Student();
		jo.studentID = 202001003;
	}

}
