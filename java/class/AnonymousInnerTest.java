class Outer2{
	
	int outNum = 100;
	static int sNum = 200;
	
	Runnable getRunnable(int i) { //Stack
		
		int num = 10; //Stack
		
		return new Runnable(){
			// 어차피 내부에서만 쓰이는 클래스므로 클래스 형식 없애고 바로 Runnable 인터페이스를 '구현한 객체'형태로 return하는 것 >> anaymous 클래스
			
			int localNum = 1000;

			@Override
			public void run() {
				
//				i = 50; 
				////아래 출력처럼 가져다 쓸 때는 오류가 없음. 
				////그러나 getRunnable 메서드는 호출 후 스택에서 사라지고, run메서드는 다시 호출될 수 있음 stack에 잡히면 안됨
				////입력변수(int i)를 final로 선언하기도.
				//// >> 외부 지역 변수를 사용할 때 주의해야함.
//				num = 20;
				
				System.out.println("i =" + i); // 상수풀에 저장된 내용 가져다 씀
				System.out.println("num = " +num);  //상수풀에 저장된 내용 가져다 씀
				System.out.println("localNum = " +localNum);
					
				System.out.println("outNum = " + outNum + "(외부 클래스 인스턴스 변수)");
				System.out.println("Outter.sNum = " + Outer2.sNum + "(외부 클래스 정적 변수)");

				
			}
			
		}; //implementation의 끝이 여기까지임을 표시
//		return new MyRunnable(); // 이 클래스는 내부에서만 사용됨 >> 익명 내부 클래스
	}
	
	Runnable runnable = new Runnable() {//anonymous 클래스로 바로 생성하는 방법도 있음
		//이 경우 Outer2 클래스의 인스턴스 변수
		
		@Override
		public void run() {

			System.out.println("Runnable class");
			
		}
	};
	
}

public class AnonymousInnerTest {

	public static void main(String[] args) {
		
		Outer2 out = new Outer2();
		Runnable runner = out.getRunnable(100);
		//getRunnable 호출 후 사라짐 >> int i와 int num도 사라짐
		
		runner.run();
		//그럼에도 지역 클래스에서 사용할 수 있는 이유는 컴파일러가 constant pool에 저장해놓기 때문임
		// 그러나 해당 변수들을 변경하는 것은 불가능
		
		out.runnable.run();

	}

}
