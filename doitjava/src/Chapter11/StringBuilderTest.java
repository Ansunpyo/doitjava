package Chapter11;

public class StringBuilderTest {
	public static void main(String[] args) {
		String javaStr = new String("Java");
		System.out.println("javaSTr 문자열 주소 :" + System.identityHashCode(javaStr));
		
		StringBuilder buffer = new StringBuilder(javaStr);
		System.out.println("연산 전 buffer 메모리 주소: " + System.identityHashCode(buffer));
		
		buffer.append(" and");
		buffer.append(" android");
		buffer.append(" programing is fun!!!");
		System.out.println("연산 후 buffer 메모리 주소: " + System.identityHashCode(buffer));
		
		javaStr = buffer.toString();
		System.out.println(javaStr);
		System.out.println("연결된 java 문자열 주소: " + System.identityHashCode(buffer));
		
	}

}
