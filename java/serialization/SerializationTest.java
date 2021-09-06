import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Person implements Serializable {//구현 코드 없는 interface
	
	String name;
	String job;
//	transient String job; //String의 default값으로 처리
	
	public Person() {}
	public Person(String name, String job) {
		this.name = name;
		this.job = job;
	}
	
	public String toString() {
		return name + "," + job;
	}
}

public class SerializationTest {

	public static void main(String[] args) {
		
		Person personLee = new Person("이순신", "대표이사");
		Person personKim = new Person("김유신", "상무이사");
		
		try(FileOutputStream fos = new FileOutputStream("serial.txt");
				ObjectOutputStream oos = new ObjectOutputStream(fos)){
					
			oos.writeObject(personLee);
			oos.writeObject(personKim);
			
		} catch ( IOException e ) {
			System.out.println(e);
		}
		
		try(FileInputStream fos = new FileInputStream("serial.txt");
				ObjectInputStream ois = new ObjectInputStream(fos)){
					
			Person pLee = (Person)ois.readObject();//readObject()의 반환형은 Object이므로 다운캐스팅
			Person pKim = (Person)ois.readObject();
			//write할 때 클래스의 정보, 생성자 정보, 멤버변수 정보 모두 들어감
			//읽을 때 classnotfound 오류 생길수 있으므로 처리
			
			System.out.println(pLee);
			System.out.println(pKim);
			
		} catch ( IOException e ) {
			System.out.println(e);
		} catch (ClassNotFoundException e) {
			System.out.println(e);
		}

	}

}
