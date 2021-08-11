# 문자형

# 문자세트
각 문자를 얼마로 표현할 것인지 코드 값을 모아둔 것을 문자세트(character set)라고 함

'A' - 인코딩 - 65 - 디코딩 - 'A'

ex( ASKII, euc-kr, utf-8, utf-16)

# ASKII - 1byte ( 8bit )


# UNICODE
영어뿐만 아니라 각 나라의 문자세트가 생기면서 호환의 문제가 발생
모든 나라의 문자세트를 표준화한 것 >> UNICODE
이 유니코드는 크게 utf-8과 utf-16으로 구성

ex) utf- 16 ( 2bytes )
멀티바이트를 사용할 때 한 바이트만 사용하면 ASKII와 호환. 앞자리는 0으로 사용.
두 바이트 모드 사용할 때는 다른 문자세트?와 혼용해서 사용

여튼 유니코드는 아스키와 완벽하게 호환됨

# JAVA의 문자세트
UNICODE를 사용하며 utf-16 인코딩을 사용 ( 모든 문자를 2bytes로 표시 )

# utf - 16과 utf - 8의 차이
utf-16은 모든 문자를 2bytes로 표현
utf-8은 1~4bytes 사이에서 유동적으로 표현. 조금 더 효율적으로 사용하기 위한 것임.

# 문자형 변수
문자를 위한 데이터타입 char ch = 'A';

cf) 'A' 와 “A”는 전혀 다른 것.
'A' - 2bytes 문자
“A” - 문자열. 실제로는 A\0 (문자열의 끝을 나타내는 null character으로 구성되어 있음)

내부적으로 숫자로 표현되므로, 숫자를 넣어도 문자가 출력될 수 있음
char ch2 = 66;
다만, 양수만 사용 가능 + 2bytes 내에서 핸들링 가능한 숫자만 가능

public class CharacterTest {
	public static void main(String[] args) {
		
		char ch1 = 'A';
		System.out.println(ch1);
		System.out.println((int)ch1);
		
		char ch2 = 66;
		System.out.println(ch2);
		System.out.println((char)ch2);
		
		int ch3 = 67;
		System.out.println(ch3);
		System.out.println((char)ch3);
	}
}

# UNICODE 사용 방법

	char han = '한';
	char ch = '\uD55C';
      System.out.println(ch);

ch는 16진수로 작성된 것을 확인 가능
16진수는 한 자리수가 4bit ( 16개 ) 표현 가능
숫자가 4개이므로 16bit ( 2bytes )
