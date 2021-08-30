public class AddTest {

	public static void main(String[] args) {

//		Add addL = (x, y) -> {return x+y;};
		//매개변수 2개 이상일 경우는 괄호 생략 불가능
		//실행문 하나일 경우 중괄호 생략 가능 but 반환문일 경우 생략 불가능
		
		Add addL = (x, y) ->  x+y;
		//return까지 생략하면 중괄호 생략 가능
		System.out.println(addL.add(2, 3));		
	}

}
