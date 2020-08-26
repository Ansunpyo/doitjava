package Example;

import java.util.Scanner;

public class Exam03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		
		for(int i=1; i<=10; i++) {
			sum += i;
		}	
			System.out.println("1부터 10 까지의 합은" + sum + "입니다");
		

	}
}
