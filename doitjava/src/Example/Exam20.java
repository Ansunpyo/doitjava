package Example;

import java.util.HashSet;
import java.util.Set;

public class Exam20 {

	public static void main(String[] args) {
		int num = (int)(Math.random() * 48) + 1;
		Set<Integer> set = new HashSet<Integer>();
		while(set.size() < 6) {
			num = (int)(Math.random() * 48) + 1;
			set.add(num);
		}
		System.out.println("로또 생성기");
		for(int n:set) {
			System.out.print(n + " ");
		}
	}

}
