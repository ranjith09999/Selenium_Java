package Maven.MavenProjects.SamplePrograms;

public class MobilePhone extends TelePhone {
	
	final int num = 20;
	
	public void takePhotos() {
//		num = 30;
		System.out.println(num);

	}
	public void messaging() {
		System.out.println("message");

	}
	@Override
	public void receivedCall() {
		System.out.println("Attend thro Bluetooth");

	}
	
	

}
