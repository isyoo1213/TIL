import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsException {
	
	public Class loadClass(String fileName, String className) throws ClassNotFoundException, FileNotFoundException {
		//해당 exception들을 호출하는 method에서 처리
		FileInputStream fis = new FileInputStream(fileName);
		Class c = Class.forName(className);
		return c;
		
	}

	public static void main(String[] args) {
		
		ThrowsException test = new ThrowsException();
		try {
			test.loadClass("a.txt", "abc");
			//만약 a.txt파일이 없을 때에는 CalssNotFoundException이 호출되고 FileNotFoundException은 무시
			//a.txt 파일 있을 때에는 FileNotFoundException 호출
		} catch (ClassNotFoundException e) {
			System.out.println(e);
		} catch (FileNotFoundException e) {
			System.out.println(e);
		} catch (Exception e) {
			//특정한 예외 외에 나머지 예외들을 모두 처리해줌
			//최상위 클래스인 Exception을 활용. 업캐스팅.
			//catch가 여러개 있을 경우 가장 아래에 작성해야 예외들이 최상위에 포함되어버리는 상황 발생하지 않도록 해줌.
		}
		
		System.out.println("end");

	}

}
