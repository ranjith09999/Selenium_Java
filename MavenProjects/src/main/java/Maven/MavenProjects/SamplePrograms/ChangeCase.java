package Maven.MavenProjects.SamplePrograms;

public class ChangeCase {

	public static void main(String[] args) {
		String text = "KoushiK";
		char[] charArray = text.toCharArray();
		for (char c : charArray) {
			if (Character.isUpperCase(c)) {
			System.out.print(Character.toLowerCase(c));
			}else {
			System.out.print(Character.toUpperCase(c));
			}
		}
	}

}




