package Maven.MavenProjects.SamplePrograms;

public class PrintPrimeNumbers {

	public static void main(String[] args) {
		int Pnum = 100, count;

		  for (int i = 2; i < Pnum; i++) {
		   count = 0;
		  
		   for (int j = 2; j < i ; j++) {
		    if (i % j == 0) {
		     count++;
		     break;
		    }
		   }

		   if (count == 0) {
		    System.out.println(i);
		   }

	}

}
}
