# 운영체제 구조

# 응용 프로그램, 운영체제, 컴퓨터 하드웨어(system resource)의 관계
운영체제는 도서관
응용 프로그램은 시민
컴퓨터 하드웨어는 책
운영체제의 역할
시민은 도서관에 원하는 책(자원)을 요청함
도서관은 적절한 책(자원)을 찾아서 시민에게 빌려줌
시민이 기한이 다 되면, 도서관이 해당 책(자원)을 회수함

운영 체제는 응용 프로그램이 요청하는 메모리를 허가하고 분배한다
운영체제는 응용 프로그램이 요청하는 CPU 시간을 제공한다
운영체제는 응용프로그래밍이 요청하는 IO Devices 사용을 허가/제어 한다.

# 운영체제는 사용자 인터페이스 제공

#쉘 ( Shell )

사용자가 운영체제 기능과 서비스를 조작할 수 있도록 인터페이스를 제공하는 프로그램


쉘은 OS에 접근하게 해주는 하나의 응용 프로그램이기도.
쉘은 CLI 와 GUI 두 종류로 분류

# 운영 체제는 사용자 뿐만 아니라 응용 프로그램을 위해서도 인터페이스를 제공

프로그래밍 언어를 통해서 응용 프로그램은 운영체제에 무언가를 요청하고 운영체제는 API 형태로 제공해 줌.

API ( Application Programming Interface )
함수로 제공
open() - 이 함수도 API의 일종이라고 생각 할수도.
보통은 라이브러리(library) 형태로 제공



API는 운영체제에 보내는 함수형태의 요청서의 집합.
도서관에 책을 빌리기 위해 놓여있는 신청서

shell도 하나의 응용프로그램
사용자로부터 입력을 받으면 해당 요청에 맞는 운영체제가 제공하는 API를 통해서 운영체제에 요청. 

# 시스템 콜

시스템 콜 or 시스템 호출 인터페이스

운영체제가 응용 프로그램이 운영체제 각 기능을 사용할 수 있도록 시스템 콜이라는 명령 또는 함수를 제공

API 내부에는 시스템 콜을 호출하는 형태로 만들어지는 경우가 대부분




사용자든 응용 프로그램이든 운영체제 외부에서 컴퓨터 자원을 사용하기 위해 요청을 하면, 운영체제는 System Call이라는 요청서를 제공함

그러나 일반적으로 쓰이는 프로그래밍 언어와 사용법이 달라 어려움이 있을 수 있으므로, 각 언어에 맞는 인터페이스의 API 형태로 제공하는 것

이러한 Library와 API를 통해 application, shell을 만들고 유저로부터 사용하도록 함.


# 운영 체제를 만든다면?
1. 운영체제를 개발한다 (kernel - 핵심 운영체제 기능을 가진 소프트웨어)
2. 시스템 콜을 개발
3. C API(library) 개발
4. Shell 프로그램 개발
5. 응용 프로그램 개발

# 운영체제와 시스템 콜

표준적인 시스템 콜을 정의하는 예
POSIX API - UNIX 계열의 운영체제가 따르는 시스템 콜 정의
WINDOWS API 

API : 각 언어별 운영체제 기능 호출 인터페이스 함수
시스템 콜 : 운영체제 기능을 호출하는 함수

# 정리
운영체제는 컴퓨터 하드웨어와 응용 프로그램을 관리한다
사용자 인터페이스를 제공하기 위해 쉘 프로그램을 제공한다
응용 프로그램이 운영체제 기능을 요청하기 위해서, 운영체제는 시스템 콜을 제공한다
보통 시스템 콜을 직접 사용하기 보다는, 해당 시스템 콜을 사용해서 만든 각 언어별 라이브러리 ( API ) 를 사용한다.
