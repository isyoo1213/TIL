# POJO JAVA 

palin old java object
순수한 자바 오브젝트. 외부의 종속이 없고 순수한 자바로만 이루어진 오브젝트

# POJO 특징

특정 Library, Module에서 정의된 클래스를 상속 받아 구현하지 않아도 된다.
외부의 의존성을 두지 않고 순수한 JAVA로 구성이 가능해야 한다.

특정 환경에 종속되지 않는다.
비즈니스 로직에 외부 종속적인 http request, session을 사용하는 경우 POJO 위배
@Annotation 기반으로 설정하는 부분도.

# Spring, Hibernate
객체지향적인 설계를 하고 있으며 POJO를 지향
개발자가 서비스 로직에 집중하고 POJO로 쉽게 개발할 수 있도록 지원
