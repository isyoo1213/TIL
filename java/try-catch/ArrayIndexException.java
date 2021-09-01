public class ArrayIndexException {

	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5};
		
		try {
			for(int i = 0; i<=5; i++) {
				System.out.println(arr[i]);
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			//해당 자료형의 예외가 발생할 경우 e라는 변수로 전달되어 받아옴
			System.out.println(e.getMessage());
			System.out.println(e.toString());
			//exception의 full name과 메세지 둘 모두를 
		}
		
		System.out.println("here!!!!");
		//앞 코드 블럭에서 예외발생했지만 정상적으로 모두 수행
		
//		Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5
//		at ch08.ArrayIndexException.main(ArrayIndexException.java:10)

	}

}
