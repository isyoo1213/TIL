public class Student {

	private int studentNum;
	private String studentName;
	
	public Student(int studentNum, String studentname) {
		this.studentNum = studentNum;
		this.studentName = studentname;
	}
	
	public String toString() {
		return studentNum + "," + studentName;
	}

	@Override
	public boolean equals(Object obj) {
		//원래 equals는 인스턴스의 메모리 위치를 비교하지만 편의를 위해 오버라이딩
		if(obj instanceof Student) {
			//인스턴스들의 물리적 위치는 다를 수 있지만 같은 클래스로 생성한 인스턴스인지 확인
			Student std = (Student)obj;
			//인스턴스를 다운캐스팅
			if(this.studentNum == std.studentNum) {
				//둘 모두 기본형 변수이므로 값 자체를 반환??
				//stack에 저장? 주소가 아닌 값 자체를 반환하고 바로 비교?
				return true;
			} else {
				return false;
			}
		}
		return false;
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}
	
}

