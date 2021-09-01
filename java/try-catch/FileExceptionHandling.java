import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileExceptionHandling {

	public static void main(String[] args) {
		
		FileInputStream fis = null;
		try {
			fis = new FileInputStream("a.txt");
			//throws와 try-catch로 핸들링 가능
			//main method이므로 try-catch로 접근
			//진행을 위해 project 하위에 a.txt 생성해줌
			System.out.println("read");
			
//			try {
//				fis.close();
//				//닫을 때에도 exception handling하라고 오류 표시
//			} catch (IOException e) {
//				e.printStackTrace();
//			} 
		} catch (FileNotFoundException e) {
			//e.printStackTrace();
			System.out.println(e);
			//a.txt파일 삭제 후에 이곳에서 catch한 후 end 출력 스테이트먼트 실행
//			try {
//				fis.close();
//				//try와 catch에서 fis를 계속 close해줘야하고, 해당 스테이트먼트도 try-catch로 감싸줘야 하는 번거로움
//			} catch (IOException e1) {
//				// TODO Auto-generated catch block
//				e1.printStackTrace();
//			}
			return;
			//a.text삭제 후 run해보면, 파일이 열리지 않아도 finally는 항상 실행되는 것을 확인
		} finally {
			if(fis != null) {
				//파일이 열려서 fis가 생성됐을 때만 close해주도록 구현
				try {
					fis.close();
					System.out.println("File closed");
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			System.out.println("finally");
		}

		System.out.println("end");

	}

}

