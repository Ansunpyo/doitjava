import java.util.Scanner;

public class Mabangjin {
	public static void main(String[] args) {
		System.out.println("���ڸ� �Է����ּ���");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		 for(int i = 1; i<=num; i++){
			 for(int j = 1; j<=i; j++){
				System.out.print("*");
			 }
			 	System.out.println();
			 }
	}
}
