import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamTest3 {

	public static void main(String[] args) {
		
		int i;
		try(FileInputStream fis = new FileInputStream("input2.txt")){
			
			byte[] bs = new byte[10];
			while((i = fis.read(bs, 1, 9)) != -1) {
				//read(bs)는 읽은 자료의 바이트 수 반환.
				//end of file일 경우 -1 반환함
				//off를 1로주고 9개만 읽게끔 >> 끝에 1개 안읽고 앞의 9개씩만 읽음
				
//				for(int ch: bs) {
				for(int j = 0; j < i; j++) {
					//새로 읽은 자료가 할당된 i의 바이트 개수만큼만 반복
					//버퍼에는 기존 자료 남아있지만, 출력은 새로 읽어들인 자료만.
					System.out.print((char)bs[j]);
				}
				System.out.println(" : " + i + "바이트 읽음");
				
			}
//			ABCDEFGHIJ : 10바이트 읽음
//			KLMNOPQRST : 10바이트 읽음
//			UVWXYZQRST : 6바이트 읽음 >> 버퍼에 기존에 있는 자료가 남아있어서 출력됨.
			
		} catch(IOException e) {
			System.out.println(e);
		}

	}

}

