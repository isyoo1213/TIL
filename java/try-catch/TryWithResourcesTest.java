import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TryWithResourcesTest {

	public static void main(String[] args) {
		
			
//		FileInputStream fis = null;
		
		try(FileInputStream fis = new FileInputStream("a.txt")) {
			//선언 및 생성을 소괄호 내에 작성하고 try-catch처리
			//이렇게 하면 close 같이 되므로 IOException까지 처리됨
			//fileinputstream을 f1으로 살펴보면 AutoClosealbe 인터페이스를 구현함
			// exception이든 정상이든 자동으로 close() 호출하는 인터페이스 구현.

			System.out.println("read");
		} catch (FileNotFoundException e) {
			//file이 없을 때 exception
			e.printStackTrace();
		} catch (IOException e) {
			//close할 때 발생하는 exception
			e.printStackTrace();
		}
		System.out.println("end");
		//파일 삭제해도 exception처리하고 end까지 출력
			

	}

}
