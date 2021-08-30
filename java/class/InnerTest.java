class OutClass{
	
	private int num = 10;
	private static int sNum = 20;
	private InClass inClass;
	
	public OutClass(){
		inClass = new InClass();
	}
	
	class InClass{
		
		int iNum = 100;
		
//		static int sInNum = 500; ////내부 클래스는 외부 클래스 생성 후 생성되므로 static 변수 선언은 불가
		
		void inTest() {
			
			System.out.println("OutClass num = " +num + "(외부 클래스의 인스턴스 변수)");
			System.out.println("OutClass sNum = " + sNum + "(외부 클래스의 스태틱 변수)");
			System.out.println("InClass inNum = " + iNum + "(내부 클래스의 인스턴스 변수)");

		}
		
	}
	
	static class InStaticClass {
		
		int iNum = 100;
		static int sInNum = 200;
		
		void inTest() {
			
			System.out.println("IutClass num = " +iNum + "(내부 클래스의 인스턴스 변수)");
			System.out.println("OutClass sNum = " + sNum + "(외부 클래스의 스태틱 변수)");
			System.out.println("InClass inNum = " + sInNum + "(내부 클래스의 스태틱 변수)");
class OutClass{
	
	private int num = 10;
	private static int sNum = 20;
	private InClass inClass;
	
	public OutClass(){
		inClass = new InClass();
	}
	
	class InClass{
		
		int iNum = 100;
		
//		static int sInNum = 500; ////내부 클래스는 외부 클래스 생성 후 생성되므로 static 변수 선언은 불가
		
		void inTest() {
			
			System.out.println("OutClass num = " +num + "(외부 클래스의 인스턴스 변수)");
			System.out.println("OutClass sNum = " + sNum + "(외부 클래스의 스태틱 변수)");
			System.out.println("InClass inNum = " + iNum + "(내부 클래스의 인스턴스 변수)");

		}
		
	}
	
	static class InStaticClass {
		
		int iNum = 100;
		static int sInNum = 200;
		
		void inTest() {
			
			System.out.println("IutClass num = " +iNum + "(내부 클래스의 인스턴스 변수)");
			System.out.println("OutClass sNum = " + sNum + "(외부 클래스의 스태틱 변수)");
			System.out.println("InClass inNum = " + sInNum + "(내부 클래스의 스태틱 변수)");

		}
		
		static void sTest() {
			
//			System.out.println("IutClass num = " +iNum + "(내부 클래스의 인스턴스 변수)"); // 내부 클래스의 인스턴스 변수가 생성되지 않았을 수 있음
			System.out.println("OutClass sNum = " + sNum + "(외부 클래스의 스태틱 변수)");
			System.out.println("InClass inNum = " + sInNum + "(내부 클래스의 스태틱 변수)");
			
		}
		
	}
	
	public void usingClass() {
		inClass.inTest();
	}
	
}

public class InnerTest {

	public static void main(String[] args) {
		
	/*	OutClass outClass = new OutClass();
		outClass.usingClass();
		
		OutClass.InClass inner = outClass.new InClass();
		inner.inTest();
		*/
		
		OutClass.InStaticClass sInClass = new OutClass.InStaticClass();
		sInClass.inTest();
		
		System.out.println();
		
		OutClass.InStaticClass.sTest();

	}

}
