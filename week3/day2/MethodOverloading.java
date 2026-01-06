package week3.day2;

public class MethodOverloading {
	
	public void reportStep(String msg, String status)
	{
		System.out.println("Message: "+msg +" | "+"Status: "+status);
	}
	
	public void reportStep(String msg, String status, Boolean snap)
	{
		System.out.println("Message: "+msg +" | "+"Status: "+status+" | "+"Snap: "+ snap);
		
	}
	
	public static void main(String[] args) {
		MethodOverloading movload = new MethodOverloading();
		movload.reportStep("Test 1", "PASS");
		movload.reportStep("Test 2", "FAIL", false);
     }

}
