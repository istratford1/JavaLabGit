
public class DoStuffWithAnimals {

	// main entry point for the program
	
	public static void main(String[] args)
	{
		
		cat cat1 = new cat("Kitty");
		System.out.println(cat1.GetName());
		
		cat cat2 = new cat("Samson");
		System.out.println(cat2.GetName());
		System.out.println("Name in reverse is " + cat2.ReverseName());
		
		
	}
	

	
			
	
}
