package Chapter13.stream;

public class Member {
	public static int Male = 0;
	public static int FeMale = 0;
	
	private String name;
	private int sex;
	private int age;
	
	public Member(String name, int sex, int age) {
		this.name = name;
		this.sex = sex;
		this.age = age;
	}
	
	public int getSex() { return sex; }
	public int getAge() { return age; }
	public String getName() { return name; }
}
