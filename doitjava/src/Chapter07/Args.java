package Chapter07;

public class Args {
	public static void main(String[] args) {
		if (args.length != 0) {
			for (int i = 0; i < args.length; i++) {
				System.out.println(args[i]);
			}
		} else {
			System.out.println("입력한 매개변수가 없습니다.");
		}
    }
}
