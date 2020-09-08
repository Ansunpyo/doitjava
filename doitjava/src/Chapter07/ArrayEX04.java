package Chapter07;

public class ArrayEX04 {

	public static void main(String[] args) {
		int[] arr1 = {1, 2, 3, 4, 5};
		arr1[0] = 10;
		for(int i=0; i<arr1.length; i++) {
			System.out.println(arr1[i]);
		}
		System.out.println();
		
		int[] arr2 = new int[10];
				arr2 = arr1;
		for(int i=0; i<arr2.length; i++) {
			System.out.println(arr2[i]);
		}
			
	}

}
