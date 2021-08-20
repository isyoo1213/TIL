2 - 10 # 접근 제어 지시자 access modifier와 정보은닉 information hiding

클래스 외부에서 클래스의 멤버 변수, 메서드, 생성자를 사용할 수 있는지 여부를 지정하는 키워드

# private
같은 클래스 내부에서만 접근 가능
상속관계에서도 접근 불가능

# default
같은 package 내부에서만 접근 가능


# protected
상속관계에서 접근 가능 ( 하위에서 상위 )
같은 package 내부에서도 접근 가능

# public
클래스 외부 어디에서나 접근 가능

# get() / set() 메서드

private으로 선언된 멤버 변수(필드, 속성)에 대해 접근, 수정할 수 있는 메서드를 public으로 제공

get() 메서드만 제공되는 경우 read-only 필드

이클립스에서 자동으로 생성됨

우클릭 > Source > Generate Gtters ans Setters

get, set으로 접근하지 않으면, 멤버 변수에 직접 할당가능하므로 취약점 노출할 수 있음
>> set 메서드를 통해 제어

public void setMonth(int month) {
		if(month <1 || month >12) {
			isValid=false;
		} else {
			isValid = true;
			this.month = month;
		}
		this.month = month;
	}
