import java.util.ArrayList;
import java.util.Arrays;

public class Test {

	public static void main(String[] args) {
		
		String[] arr = {"나는야", "array임"};
		
		System.out.println(arr);
		// 최상위 클래스의 toString
		System.out.println(arr.toString());
		// 최상위 클래스의 toString
		System.out.println(Arrays.toString(arr));
		//Arrays 클래스의 toString
		System.out.println();
		System.out.println();
		
		ArrayList<String> als = new ArrayList<>();
		als.add("나는야");
		als.add("ArrayList임");
		System.out.println(als);
		// Collection 인터페이스 구현한 AbstractList의 toString
		// StringBuilder를 통해
		System.out.println(als.toString());
		// Collection 인터페이스 구현한 AbstractList의 toString
		System.out.println(als.toArray().toString());
		//최상위 클래스의 toString
		//toArray는 object 객체 반환
		
		StringBuilder stringBuilder = new StringBuilder();
		StringBuilder stringBuilder2 = new StringBuilder("안녕하세요");
		System.out.printf("length: %d\ncapacity: %d\n", stringBuilder2.length(),stringBuilder2.capacity());
		stringBuilder.append("back");
		System.out.printf("length: %d\ncapacity: %d\n", stringBuilder.length(),stringBuilder.capacity());
		

	}

}

