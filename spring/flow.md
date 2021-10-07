# Spring

IoC

AOP

IoC/DI 의존 관계 주입
AOP 관점 중심 프로그램
PSA 이식 가능한 추상화
>> POJO

# IoC Inversion Of control
일반적인 java 객체를 new로 생성해 개발자가 관리하는 것이 아닌 Spring Container에 모두 맡김
개발자 -> 프레임워크로 제어의 객체 관리 권한이 넘어감 -> 제어의 역전

# DI Dipendency Injection 객체주입

의존성으로부터 격리 -> 코드 테스트에 용이
Mock과 같은 기술을 통해 안정적인 테스트 가능
코드 확장, 변경의 영향을 최소화 ( 추상화 )
순환참조 막을 수 있음

# @Component

스프링에서 직접 싱글톤으로 관리함

# 톰캣

웹서버가 이해하지 못하는 html 외 java언어로 작성된 문서들을 위임받아 컴파일하고 html파일로 변환시켜 웹서버가 요청에 응답할 수 있도록 해줌

# 서블릿 컨테이너

간단하게 자바를 통해 웹을 제어할 수 있는 것. 톰캣.

요청을 받았을 때, 정적 파일들은 톰캣이 아닌 아파치에서 처리

스프링은 URL을 통한 접근을 처리하는 것이 아닌, URI를 통한 식별자로 접근함
요청 처리시 무조건 자바를 거친다. 따라서 아파치는 톰캣을 거친다.

클라이언트에게 최초의 자바 관련 요청 > 수많은 동시처리를 위해 스레드 생성 > 서블릿객체 생성 후 작업 후 html로 반환해줌

지정된 쓰레드 개수를 넘는 요청이 들어오면 대기 상태
응답이 완료된 스레드는(톰캣은 stateless) 사라지지 않고 대기 중인 요청을 응답하며 재사용 

최종적으로 HttpServletRequest 객체와 HttpServletResponse 객체
>> 이는 스프링이 아닌 톰캣이 들고있는 객체

# web.xml

ServletContext의 초기 파라미터 설정
Session(인증을 통해 들어오는 것 ) 의 유효시간 설정
Servlet/jsp 정의 및 매핑 - 요청된 자원/식별자의 주소를 안내
Mime type 매핑 - 요청 메서드에 포함된 데이터를 매핑
Welcome file list
Error Pages 처리
리스너/필터 설정
보안

그러나 Servlet/jsp 매핑시 ( web.xml에 직접 매핑 or @WebServlet 어노테이션 사용) 모든 클래스에 매핑을 적용시키면 코드가 복잡해지므로 FrontController 패턴을 이용함

클라이언트의 URI or java file에 대한 Request가 들어오면
자원에 바로 접근하지 않고 톰캣을 거침

톰켓에선 요청에 대한 정보를 가진 request 객체와 이를 토대로 response 객체를 생성함
( buffered write / buffered reader의 가변길이의 문자를 받아서 톰캣이 알아서 객체를 만들어줌)

>> 객체 생성을 통해 함수를 사용가능하도록 함

이후 web.xml에서 다양한 처리를 시행하지만, 이에 대한 부담을 줄이기 위해 특정 주소에 대한 처리를 front controller가 가져가 내부에 대한 자원에 request를 생성해 재요청 함으로써 접근 가능하도록 함

>> 이 때 톰캣에서 생성한 request객체에 front controller가 재요청하며 생성한 request를 patch시켜줌  by requestDispatcher

즉, 요청 시 가지고있는 데이터를 새로운 요청을 생성할 때 유지할 수 있도록 해주는 것
>> 페이지 간 데이터 이동이 가능하게 함

DispatchSevlet - FrontController 패턴 + RequestDispatcher


# ApplicationContext

request를 받으면, web.xml에서 스프링 내부로 들어가기 위해 

# 1. ContextLoaderListener
요청이 들어오면 servlet이 생성되고 정해진 개수에 따라 스레드가 만들어짐

많은 Request들이 공통으로 사용하는 DB나, 모든 쓰레드가 공통적으로 사용하는 것들은 미리 COntextLoaderListener를 통해 띄움

CLL은 root_ApplicationContext라는 파일을 읽고, 해당 파일은 쓰레드에서 공통적으로 사용하는 것들을 메모리에 띄워주고 IoC컨테이너에서 관리해줌

# 2. DispatchServlet가 동작하며 컴포넌트 스캔을 함

디스패치서브릿은 주소 분배를 하는데, 그 이전에 분배하고자 하는 주소의 클래스들이 Ioc컨테이너의 메모리에 객체로 떠있어야 함 >> src 폴더 내에 static으로 존재하는지 스캔하며 확인 by 다양한 어노테이션. by IoC

1에서 띄운 객체는 2에 접근하지 못하지만,(시간선후성) 2에서 띄운 객체들은 1에 접근 가능함. 2에서 생성해서 메모리에 올린 객체들이 가져다가 사용함
