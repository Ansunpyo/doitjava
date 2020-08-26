package Example;

import java.util.Scanner;

public class Exam05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;

		for (int i = 1; i <=50; i++) { 
			if(i % 3 == 0) {
				sum++;
			}
		}
		System.out.println(sum + "ÀÔ´Ï´Ù");	
	}

}
