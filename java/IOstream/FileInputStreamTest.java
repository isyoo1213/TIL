import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamTest {

	public static void main(String[] args) {
		
		FileInputStream fis = null;
		try {
			fis = new FileInputStream("input.txt");
			System.out.println((char)fis.read());
			System.out.println((char)fis.read());
			System.out.println((char)fis.read());
			//read() int형 반환 - the next byte of data or -1
			//read()에서도 exception처리. IO. 그러나 아래에 RileNotFoundException의 상위이므로 아래를 상위로 바꿔줌
		} catch (IOException e) {
			e.printStackTrace();
//			try {
//				fis.close();
//			} catch (IOException e1) {
//				// TODO Auto-generated catch block
//				e1.printStackTrace();
//			} catch (Exception e2) {
//				System.out.println(e2);
//			}// finally 작성했으므로 예외에서 닫아주는 처리 불필요
			
		} finally {
			try {
				fis.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			//stream은 정상 실행이든 exception이든 close 필요
			//fis가 null이면 close할 때도 exception이 발생할 수 있으므로 각각의 close에도 try-catch 적용
			 catch (Exception e2) {
					System.out.println(e2);
				}
			//
		}
		System.out.println("end");

	}

}

