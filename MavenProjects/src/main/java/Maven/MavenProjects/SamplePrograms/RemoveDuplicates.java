package Maven.MavenProjects.SamplePrograms;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) {
		int[] numbers = {2,3,7,7,8,4,2};
		Set<Integer> unique = new HashSet<Integer>();
		for (int eachNumber : numbers) {
			unique.add(eachNumber);
		}
		System.out.println(unique);
		
		
		
		
		
		
		
		
		

	}

}
