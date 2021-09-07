import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileTest {

	public static void main(String[] args) throws IOException {
		
		RandomAccessFile rf = new RandomAccessFile("random.txt", "rw");
		
		rf.writeInt(100);
		System.out.println("pos: " + rf.getFilePointer());
		rf.writeDouble(3.14);
		System.out.println("pos: " + rf.getFilePointer());
		rf.writeUTF("안녕하세요");
		System.out.println("pos: " + rf.getFilePointer());
		
		rf.seek(0);
		//읽기 전에 처음으로 돌아가게끔 포인터 지정
		
		int i = rf.readInt();
		double d = rf.readDouble();
		String str = rf.readUTF();
		
		System.out.println(i);
		System.out.println(d);
		System.out.println(str);
		//자바는 modified UTF-8을 사용. 3byte씩 잡힘
		//12+17(1글자당 3byte + nullcreator..? 2btye)

	}

}
