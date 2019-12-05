package Maven.MavenProjects.SamplePrograms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LearnList {
public static void main(String[] args) {
//	System.out.println(Integer.MAX_VALUE);
	List<String> list = new ArrayList<String>();
	list.add("Sam");
	list.add("Koushik");
	list.add("Sarath");
	list.add("Alex");
	list.add("Balaji");
	
	
	list.remove("Sam");
	
	Collections.sort(list);
	Collections.reverse(list);
	
	for (String eachName : list) {
		System.out.println(eachName);
	}
	if(list.contains("Balaji")) {
		System.out.println("Balaji is present");
	}
	else {
		System.out.println("Balaji is not there");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
