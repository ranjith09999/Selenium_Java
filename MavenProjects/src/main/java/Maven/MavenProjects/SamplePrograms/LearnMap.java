package Maven.MavenProjects.SamplePrograms;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class LearnMap {

	public static void main(String[] args) {
		
		Map<String, Integer> brand = new HashMap<String, Integer>();
		brand.put("Nike", 10000);
		brand.put("Adidas", 2000);
		brand.put("Adidas", 3000);
		brand.put("Puma", 5000);
		brand.put("Rebook", 5000);
		
		for(Entry<String, Integer> eachBrand :brand.entrySet()) {
			System.out.println(eachBrand.getKey()+"-"+eachBrand.getValue());
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*System.out.println(brand.keySet());
		System.out.println(brand.values());*/
		
		
		
		
		
		
		
		
		
		
		
		/*System.out.println(brand.get("Puma"));
		System.out.println(brand.size());*/
//		System.out.println(brand.containsValue(10000));
//		System.out.println();
		/*System.out.println(brand.isEmpty());
		brand.clear();
		System.out.println(brand.isEmpty());*/
		
		
		
		
		
		

	}

}
