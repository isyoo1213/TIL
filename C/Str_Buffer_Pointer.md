문자

아스키코드
C언어의 프로그램은 아스키 코드( Ascii Code)를 따름
0~127중의 1byte로 구성되며, 주요 문자를 출력하도록 해줌
0 - 48 / A - 65 / a - 97

캐릭터형 자체에 숫자를 넣어서 처리할 수 있음
문자 입출력에서 형식 지정자로 %c를 사용
문자 입출력 함수
getchar()  - 문자 하나만 받아옴.

버퍼 Buffer
버퍼란 임시적으로 특정한 데이터를 저장하기 위한 목적으로 사용됨
C프로그램은 기본적으로 사용자가 의도하지 않아도 자동으로 버퍼를 이용해 입출력을 처리
버퍼에 우리가 처리할 데이터를 담아서 한개씩 돌아가면서 처리함
내부적으로 아무리 많은 양을 입력해도, 한번에 처리되지 않고 버퍼에 담겼다가 처리됨


문자와 버퍼
1. 입력 버퍼로 인해 흔히 발생하는 오류
컴퓨터는 줄바꿈이나 공백도 Ascii 코드로 관리하고 있음
숫자와 문자를 동시에 입력받을 때 흔히 발생함

#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
int main(void) {
	int a;
	char c;
	scanf("%d", &a);
	printf("%d", a);
	scanf("%c", &c); >> a를 처리 후 줄바꿈이 c에 문자로 들어감 ***
	printf("%c", c);
	system("pause");
}

 이러한 입력버퍼를 해결하기 위해 getchar()를 사용함

 EOF - 파일의 끝.
 개행문자 - 줄바꿈. '\n'
int temp; >> 아스키코드는 모두 숫자로 표현. 문자도 숫자로 표현되므로 int로 템프 지정.
while((temp = getchar()) != EOF && temp != '\n') { }

#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
int main(void) {
	int a;
	char c;
	scanf("%d", &a);
	printf("%d", a);
	int temp;
	while((temp = getchar()) != EOF && temp != "\n"){}
	scanf("%c", &c);
	printf("%c", c);
	system("pause");
}


문자열
말 그대로 문자들의 배열
문자열은 컴퓨터 메모리 구조상에서 마지막에 NULL 값을 포함
HELLO WORLD >> D에는 '\0'. 즉 NULL 값이 들어가있음.
* 문자의 끝을 알리는 목적으로 NULL 값이 사용됨
printf() 함수를 실행하면, 컴퓨터는 내부적으로 NULL 값을 만날 때까지 한 글자씩 출력

문자열과 포인터
문자열 형태로 포인터를 사용하면 포인터에 특정한 문자열의 주소를 넣게 됨
ex) * a 에 HELLO WORLD라는 문자열 값(**문자열 리터럴)을 넣음
  >> 컴파일러가 알아서 문자열 자체를 특정한 컴퓨터 메모리에 담길 수 있도록 알아서 남아있는 메모리 공간을 찾아 주소를 결정
  >> 문자열의 주소가 어딘가에 기록됨
  >> 그 주소를 포인터가 가지게 됨. 

  >> '읽기 전용'으로 메모리 공간에 넣은 뒤에 그 위치를 처리함 
  >> 프로그램 실행 중 변경불가 ****

문자열은 배열로, 배열은 포인터로 치환가능하므로 이렇게 포인터 변수에 바로 문자 넣기 가능.
문자의 끝 NULL 값을 만날 때까지 출력!

포인터로 문자열을 선언했다고 하더라도, 배열처럼 처리할 수 있음
#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>

int main(void) {
	char* a = "hello world";
	printf("%c", a[1]);
	printf("%c", a[4]);
	printf("%c", a[6]);
	printf("%c", a[8]);
	system("pause");
	return 0;
}

문자열 입출력 함수
scanf() : 공백을 만날 때까지만 입력
gets() : 공백까지 포함하여 한 줄을 입력받음 **

#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>

int main(void) {
	char a[100];
	gets(a);
	printf("%s\n", a);
	system("pause");
	return 0;
}
gets 함수는 버퍼의 크기를 고려하지 않으므로 버퍼크기를 벗어나도 입력을 받아버려 보안상 문제가 있을수도.
>> gets_s() 입력값 2개 받음. 특정한 범위까지만 받도록.

#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>

int main(void) {
	char a[100];
	gets_s(a, sizeof(a));  >> sizeof()를 통해 특정 크그의 버퍼만 처리함
	printf("%s\n", a);
	system("pause");
	return 0;
}

* sizeof() : 특정한 배열의 크기가 얼마인지 알려주는 내장 함수
* gets_s()를 이용할 경우, 지정 범위를 넘으면 그 즉시 런타임(runtime)오류 발생

문자열 처리를 위한 다양한 함수
C언어에서의 문자열 함수는 <string.h> 라이브러리에 포함되어 있음

strlen() : 문자열의 길이를 반환
strcmp() : 문자열 1이 문자열 2보다 사전적으로 앞에있으면 -1, 뒤에있으면 1을 반환
strcpy() : 문자열 복사
strcat() : 문자열 1에 문자열 2를 더함
strstr() : 문자열 1에 문자열 2가 어떻게 포함되어 있는지를 반환

strcmp()
#include <stdio.h>

int main(void) {
	char a[20]="Dongbin Na";
	char b[20] = "Hojoon Seok";
	printf("두 배열의 사전 순 비교: %d\n", strcmp(a, b));
	system("pause");
	return 0;
}

strcpy()

#include <stdio.h>

int main(void) {
	char a[20]="Dongbin Na";
	char b[20] = "Hojoon Seok";
	strcpy(a, b);
	printf("복사된 문자열: %s\n", a);
	system("pause");
	return 0;
}

strcat()

#include <stdio.h>

int main(void) {
	char a[30]="My name is ";  >> ** 문자열 더할경우 길어지므로 크기 늘림!!
	char b[20] = "Hojoon Seok";
	strcat(a, b);
	printf("합해진 문자열: %s\n", a);
	system("pause");
	return 0;
}

strstr()
긴 문자열에서 짧은 문자열을 찾아 그 위치를 반환
짧은 문자열을 찾은 주소값 자체를 반환하므로 단순히 출력하도록 하면 찾은 이후 모든 문자열이 출력

#include <stdio.h>

int main(void) {
	char a[30]="I like you";
	char b[20] = "like";
	printf("찾은 문자열: %s\n", strstr(a,b));
	system("pause");
	return 0;
}

** like를 찾은 후 뒤의 문자열인 like you가 출력
