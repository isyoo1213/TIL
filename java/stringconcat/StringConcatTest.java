public class StringConcatTest {

	public static void main(String[] args) {
		
		String s1 = "Hello";
		String s2 = "World";
		
		/*
		StringConcatImpl strImpl = new StringConcatImpl();
		strImpl.makeString(s1, s2);
		*/
		
		StringConcat concat = (s, v) -> System.out.println(s+","+v);
		concat.makeString(s1, s2);
		// 클래스 생성하는 부분이 생략됨. 그러나 클래스 없이 생성되는 것이 아니라, 내부적으로 익명 클래스가 생성됨.
		
		StringConcat concat2 = new StringConcat() {
			//실제로는 이렇게 anonymous 클래스가 생성됨
			
			@Override
			public void makeString(String s1, String s2) {
				
				System.out.println(s1 + "....." + s2);
				
			}
		};
		
		concat2.makeString(s1,s2);

	}

}
