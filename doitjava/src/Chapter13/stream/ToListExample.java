package Chapter13.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ToListExample {
	public static void main(String[] args) {
		List<Student2> totalList = Arrays.asList(
				new Student2("ȫ�浿", 10, Student2.Sex.MALE),
				new Student2("�����", 6, Student2.Sex.FEMALE),
				new Student2("�ſ��", 10, Student2.Sex.MALE),
				new Student2("�ڼ���", 6, Student2.Sex.FEMALE)
		);
		
		List<Student2> maleList = totalList.stream().filter(s -> s.getScore() == Student2.Sex.MALE)
				.collect(collectors.toList());
		maleList.stream().forEach(s -> System.out.println(s.getName()));
		
		System.out.println();
		Set<Student2> femaleSet = totalList.stream().filter(s -> s.getSex() == Student2.Sex.FEMALE)
				.collect(Collectors.toCollection()) -> new HashSet<Student2>()));
		femaleSet.Stream().forEach(s -> System.out.ptintln(s.getName()));
	}

}
