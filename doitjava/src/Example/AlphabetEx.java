package Example;

public class AlphabetEx {

	public static void main(String[] args) {
		char[] Alphabet = new char[26];
		Alphabet[0] = 'a';
		Alphabet[1] = 'b';
		Alphabet[2] = 'c';
		
			for(int i=0; i<Alphabet.length; i++) {
				Alphabet[i] = (char)('a' + i);
			}
			System.out.println(Alphabet);
	}

}
