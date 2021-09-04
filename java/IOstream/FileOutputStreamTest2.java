import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamTest2 {

	public static void main(String[] args) throws FileNotFoundException {
		
		FileOutputStream fos = new FileOutputStream("output2.txt", true);
		//true 인자로 전해줄 경우, 이어쓰기 가능
		try(fos){
			
			byte[] bs = new byte[26];
			byte data = 65;
			for(int i = 0; i <bs.length; i++) {
				bs[i] = data++;
			}
			
			fos.write(bs, 2, 10);
			// 2번쨰 index부터 10개만
			
		} catch ( IOException e) {
			System.out.println(e);
		}
		System.out.println("end");

	}

}
