public class GenericPrinterTest {

	public static void main(String[] args) {
		
		Powder powder = new Powder();
		
		GenericPrinter<Powder> powderPrinter = new GenericPrinter<>();
		// 제네릭 자료형을 지정해주지 않으면 Object클래스로 생성이 되고, 객체 사용시 다운캐스팅해서 사용
		powderPrinter.setMaterial(powder);
		
		Powder p = powderPrinter.getMaterial();
		// 여기서는 형변환 하지 않음. 제네릭 클래스에서 컴파일 때 T를 모두 해당 자료형으로 변환해줌
		System.out.println(powderPrinter.toString());
		
		
		// p는 object method만 사용 가능했지만, material에 method 사용 가능해짐

	}

}

