# 상수 != 변수

네이밍 컨벤션

상수
Use uppercase
_(언더바)로 구분

변수
Start with lowercase
특수문자는 $와 _(언더바)만 사용
camel case
Integer - temporary variable ( i, j, k, m)

# Data Type

Primative
정수형 literal default - int
실수형 literal default - double
문자형
char - ''

Reference

# 형변환

explicit type conversion
lower memory > higher memory

implicit type conversion
강제 형 변환시 자료 유실 가능

byte 1 < short / char 2 < int 4 < long 8 < float 4 < double 8

# Operator

이항 연산자

연산자 우선순위는 괄호로 가독성을 높일 것

논리 곱과 논리 합의 우선순위

# 심화학습

JVM 구조 

OS에서 JVM에게 할당된 메모리를 분배
Java Main.java 명령어를 통해 byte code로 작성된 .class 파일로
Class Loader를 통해Runtime Data Area(Memory Area)
Execution Engine에서 명령어를 읽어서 프로그램 실행
Garbage Collector
사용하지 않는 코드들을 모아서 메모리에서 해지

# Memory Area에서 변수가 저장되는 영역 확인해보기
Method Area > Runtime Constant Pool *
Heap
Strack
PC Register
Native Method Stack


# Heap / Stack

Stack에 값 저장
기본형 변수
 선언과 동시에 메모리 할당 >> Stack

참조형 변수
Stack과 Heap 모두 사용
실제 값은 Heap
주소는 Stack

LIFO

scope이 나눠져있으면 스택에 접근이 불가능함

기본 자료형

public class MemoryTest {
	public static void main(String[] args) {
		int argument = 4;
		System.out.println("Rirst argument: " + argument);
		argument = doubleOperation(argument);
		System.out.println("Second argument: "+argument);
	}

	private static int doubleOperation(int param) {
		int result = param * 2;
		return result;
	}
}


참조자료형

public class MemoryTest2 {
	public static void main(String[] args) {
		int port = 9000; // 기본 >> 선언과 동시에 stack에 메모리 마련 후 저장
		String host = "localhost"; // 참조 
		// 이 둘은 동일한 scope이므로 데이터 접근 가능
	}
}

Method Area 내에 Constant pool이 존재하는 이유..?

# 비트 살펴보기 및 활용

# 비트 연산자 활용해서 알고리즘 문제 풀기
