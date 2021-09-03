import java.io.IOException;
import java.io.InputStreamReader;

public class SysteminTest1 {

	public static void main(String[] args) {
		
		System.out.println("알파벳 하나를 쓰고 [Enter]를 누르세요");
		
		int i;
		
		try {
			InputStreamReader isr = new InputStreamReader(System.in);
			//System.in은 byte단위로 읽어오는 것. 
			//보조스트림으로 감싸줌
			while((i = isr.read()) != '\n') { //System.in 까지가 stream
				//i = System.in.read();
				//read의 반환값은 int
				//System.out.println(i);
				System.out.print((char)i);				
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
