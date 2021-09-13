# 01. 객체지향

# 객체 지향의 4대 요소

# 1. 캡슐화 - 객체의 속성Variable을 보호하기 위해서 사용
ex) 컴퓨터 전원을 키기 위해 메인보드에 직접 전기신호를 주는 것이 아닌, 외부 케이스로 보호된 전원버튼을 통해 상태속성을 on/off 함

전원이라는 속성에 직접적으로 접근하는 것이 아니라, 컴퓨터가 제공하는 전원 '버튼'이라는 기능을 통해 접근

- 속성이 선언되면 이를 변경하는 method를 제공해야 함
- 실물 객체가 가진 기능을 모두 제공해야 함
- 각각의 method는 서로 관련성이 있어야 함
- 객체 안의 method는 객체 안의 속성을 처리해야하며, 다른 객체를 전달받아 해당 다른 객체에 정의된 속성을 직접 처리하면 안된다.
단, method에 실행에 필요한 값들은 객체의 형태가 아닌 '매개변수'의 형태로 전달되어져야 한다.

- 외부에서 직접 접근이 아닌 getter/setter를 통해 접근

- crud method 데이터 처리를 위한 기본적인 crud 메서드 제공
- Bussinewss logic method 비즈니스 로직 처리를 위한 method 제공
- 객체의 생명 주기 처리 method destroy(), disconnect()등 소멸에 대한 메서드
- 객체의 영구성 관리 method 외부에서 접근이 불가능한 private로 선언하고, 내부의 다른 method를 통해 사용 되도록 한다.

# 캡슐화의 장점

객체 지향의 페러다임 중 하나인 '추상화' 제공
실제로 method가 어떻게 동작하는지 외부에서 이해할 필요없고, 단순 호출만으로 해당 기능 실행함으로써 객체단위로 프로그램 설계 가능

'재사용성' 향상
한 객체에 관련된 속성 및 메서드는 모두 캡슐화의 형태로 제공 >> 객체의 모듈성과 응집도가 높아짐 >> 재사용성 높아짐

유지보수의 효율성 향상

무결성

객체의 무결성을 위해 getter/setter를 제외하고는 public method는 입력된 매개변수를 validation한 후에 실행하는 것을 기본으로 함

validation을 통해 객체의 값을 바꾸거나 값에 대한 유효성 가질 수 있음


# 2. 상속

상속의 효과
- 프로그램 구조에 대한 이해 향상
- 재사용성 향상
- 확장성 향상
- 유지보수성 향상


# 3. 다형성

하나의 개체가 여러 형태로 변화하는 것. by 오버라이딩

# 4. 추상화

추상화는 '모델링'
구체적으로 공통적인 부분, or 특정 특성을 분리해서 재조합하는 부분이 추상화
다형성, 상속 모두 추상화에 속함