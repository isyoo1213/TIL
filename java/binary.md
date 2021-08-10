bit - 컴퓨터가 표현하는 데이터의 최소 단위로 2진수 하나의 값을 저장할 수 있는 메모리의 크기

8진수는 3bit / 16진수는 4bit씩 하나로 합쳐서 표현이 가능함

MSB(Most Significant Bit) - 음수, 양수를 나타내는 비트. 1이라고해서 음수인 것은 아니고 음수 표기법이 따로 있음.


# 2진수, 8진수, 16진수 표현하기
각 진수마다 식별자를 사용해 진수에 맞는 수를 표기할 수 있음

public class BinaryTest {
	public static void main(String[] args) {
		int num = 10;
		int bNum = 0B1010; // 2진수
		int oNum = 012; // 8진수
		int xNum = 0XA; // 16진수
		
		System.out.println(num);
		System.out.println(bNum);
		System.out.println(oNum);
		System.out.println(xNum);
	}
}
