//class MyThread extends Thread{

class MyThread implements Runnable{// runnable 인터페이스로 구현시, runnable 객체를 생성자에 넘겨줌

	@Override
	public void run() {
		
		int i;
		for ( i = 1; i <= 200; i++) {
			System.out.print(i + "\t");
		}
		
	}
	
	
//	public void run() {
//		
//		int i;
//		for ( i = 1; i <= 200; i++) {
//			System.out.print(i + "\t");
//		}
//		
//	}
}

public class ThreadTest {

	public static void main(String[] args) {
		
		System.out.println(Thread.currentThread()+"start");
		//Thread 클래스의 static method
		//Thread[main,5,main]start >> Thread와 호출한 메서드, 우선순위, Thread 그룹의 정보 표시
		//총 main Thread, th1, th2 3개의 Thread가 실행
		// main Thread가 th1, th2 실행시키고 end
		// 나머지 두 thread가 switch되면서 숫자들이 섞여서 출력됨
		
//		MyThread th1 = new MyThread();
//		MyThread th2 = new MyThread();
		
//		th1.start();
//		th2.start();
		//start()는 Thread 클래스의 method
		
		MyThread runnable = new MyThread();
		Thread th3 = new Thread(runnable);
		Thread th4 = new Thread(runnable);
		//생성자에 runnable 객체를 전달
		
		th3.start();
		th4.start();
		
		System.out.println(Thread.currentThread()+"end");
		
		Runnable run = new Runnable() {
			//Runnable은 interface이므로 바로 익명객체 사용해서 만들 수 있음

			@Override
			public void run() {
				
				System.out.println("run");
				//이것도 하나의 Thread가 생성되어 실행되는 것을 확인
			}
			
		};

	}

}
