package Maven.MavenProjects.SamplePrograms.Inheritances;

public class Inheritances_Samples {

	public static void main(String[] args) {
		Subclass_Inheritance myCar = new Subclass_Inheritance();
		float myMile = myCar.mileage(65);
		System.out.println(myMile);
		
//		System.out.println(myCar.mileage(65));
		String color = myCar.getColor();
		System.out.println(color);
		myCar.applyBrake();
		int num = myCar.getCarNumber();
		System.out.println(num);
		System.out.println(myCar.brand);
	}

	}


