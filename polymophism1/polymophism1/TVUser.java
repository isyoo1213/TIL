public class TVUser {

	public static void main(String[] args) {
		
		SamsungTV tv = new SamsungTV();
		tv.powerOn();
		tv.volumeUp();
		tv.volumeDown();
		tv.powerOff();
		
		LgTV tv2 = new LgTV();
		tv2.turnOn();
		tv2.soundUp();
		tv2.soundDown();
		tv2.turnOff();

	}

}
