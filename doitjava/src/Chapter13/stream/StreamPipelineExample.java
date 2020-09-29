package Chapter13.stream;

import java.util.Arrays;
import java.util.List;

public class StreamPipelineExample {
	public static void main(String[] args) {
		List<Member> list = Arrays.asList(
				new Member("ȫ�浿", Member.Male, 30),
				new Member("ȫ�浿", Member.FeMale, 20),
				new Member("ȫ�浿", Member.Male, 45),
				new Member("ȫ�浿", Member.FeMale, 27)
				);
		
		double ageAvg = list.stream()
				.filter(m -> m.getSex()==Member.Male)
				.mapToInt(Member :: getAge)
				.average()
				.getAsDouble();
		
		System.out.println("���� ��� ����: " + ageAvg);
				
				
	}
}
