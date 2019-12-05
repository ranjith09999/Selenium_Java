package Maven.MavenProjects.SamplePrograms.Inheritances;

public class Subclass_Inheritance {
	private String color = "white";
	private int carNum = 1234;
	String brand = "BMW";
	
	public float mileage(float speed) {
		float mile ;
		if(speed < 60) {
			mile = 15;
		}else {
			mile = 18.5F;
		}
		return mile;
	}

	public String getColor() {
		return color;
	}
	public void applyBrake() {
		System.out.println("brake applied");
	}
	public int getCarNumber() {
		return carNum;		
	}

}
