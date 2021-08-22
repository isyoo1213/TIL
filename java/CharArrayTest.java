public class CharArrayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//primative형 자료들의 선언
		char[] alphabets = new char[26];
		char ch = 'A';
		
		for(int i  = 0; i < alphabets.length; i++) {
			alphabets[i] = ch++;
		}
		
		for ( char alpha : alphabets) {
			System.out.println(alpha + ","+ (int)alpha);
		}

	}

}

