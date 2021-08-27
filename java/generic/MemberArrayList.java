import java.util.ArrayList;
import java.util.Iterator;

public class MemberArrayList {
	
	private ArrayList<Member> arrayList;
	//ArrayList도 Object의 자식 클래스이므로
	//제네릭 설정 안할 경우 인스턴스 사용시 다운캐스팅 해야함
	
	
	public MemberArrayList() {
		arrayList = new ArrayList<>();
	}
	
	public MemberArrayList(int size) {
		arrayList = new ArrayList<>(size);
	}
	
	public void addMember(Member member) {
		arrayList.add(member);
	}
	
	public boolean removeMember(int memberId) {
		/*for(int i = 0; i < arrayList.size(); i++) {
			Member member = arrayList.get(i);
			
			int tempId = member.getMemberId();
			if (tempId == memberId) {
				arrayList.remove(i);
				return true;
			}
		}*/
		
		Iterator<Member> ir = arrayList.iterator();
		//제네릭 지정하지 않을 시 Object
		//객체를 순회하는 것
		while(ir.hasNext()) {
			Member member = ir.next();
			
			int tempId = member.getMemberId();
			if (tempId == memberId) {
				arrayList.remove(member);
				//객체를 삭제
				return true;
			}
		}
		
		System.out.println(memberId + "가 존재하지 않습니다.");
		return false;
	}
	
	public void showAllmember() {
		for( Member member : arrayList) {
			System.out.println(member);
		}
		System.out.println();
	}

}
