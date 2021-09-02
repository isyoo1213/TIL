public class AutoCloseTest {

	public static void main(String[] args) {
		
		AutoCloseableObj obj = new AutoCloseableObj();
		
		try(obj){
			//obj는 아무것도 수행하지 않음 >> exception 걸리지 않는 상태
			//close() 호출되는지 확인해보기
			//즉, try 수행 후 close()가 잘 호출되는지 확인
			throw new Exception();
			//Exception 강제로 발생시키기 
			//catch 수행
		} catch (Exception e) {
			System.out.println("exception");
		}
		
		System.out.println("end");

	}

}
