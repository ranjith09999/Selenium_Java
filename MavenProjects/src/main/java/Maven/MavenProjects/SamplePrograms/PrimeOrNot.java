package Maven.MavenProjects.SamplePrograms;

public class PrimeOrNot {

	public static void main(String[] args) {
		for (int i = 0; i < 100; i++) {
			isPrimeOrNot(i);
			
		}
		
	   }
	
	public static void isPrimeOrNot(int a){
		int PrimeNum = a;
		Boolean A = false;
		for (int i=2;i<PrimeNum/2;++i){
			if (PrimeNum%i==0){
				
				A = true;
				break;
			}
		}
		     if(!A){
				System.out.println("Your Number is Prime:" +PrimeNum);
			}else {
//			System.out.println("Your Number is not Prime"+PrimeNum);
		  }
    
	}
}


