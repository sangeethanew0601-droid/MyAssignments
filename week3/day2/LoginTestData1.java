package week3.day2;

public class LoginTestData1 extends TestData {
	
	public void enterUsername() {
		System.out.println("Testuser_2912@gmail.com");
	}
	public void enterPassword() {
		System.out.println("pw!@1123");
	}

	public static void main(String[] args) {
		
		LoginTestData1 ltd1 = new LoginTestData1();
		ltd1.enterCredentials();
		ltd1.enterUsername();
		ltd1.enterPassword();
		ltd1.navigateToHomePage();
	}

}