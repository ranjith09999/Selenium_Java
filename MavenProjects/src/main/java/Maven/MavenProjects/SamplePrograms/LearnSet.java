package Maven.MavenProjects.SamplePrograms;

import java.util.Set;
import java.util.TreeSet;

public class LearnSet {
public static void main(String[] args) {
//	System.out.println(Integer.MAX_VALUE);
	Set<String> set = new TreeSet<String>();
	set.add("Sam");
	set.add("Koushik");
	set.add("Sarath");
	boolean result = set.add("Alex");
	System.out.println(result);
	set.add("Balaji");
	set.add("Gopi");
	result = set.add("Alex");
	System.out.println(result);
	
	for (String eachName : set) {
		System.out.println(eachName);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
