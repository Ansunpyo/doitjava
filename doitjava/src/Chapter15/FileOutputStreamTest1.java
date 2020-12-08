package Chapter15;

import java.io.IOException;
import java.io.FileOutputStream;

public class FileOutputStreamTest1 {
	public static void main(String[] args)  throws IOException{
		try(FileOutputStream fos = new FileOutputStream("output1.txt", true)) {
			byte[] bs = new byte[26];
			byte data = 65;
			for(int i = 0; i < bs.length; i++) {
				bs[i] = data;
				data++
			}
			fos.write(bs);
			} catch(IOException e) {
				e.printStackTrace();
		}
		System.out.println("출력이 완료되었습니다");
	}
}
