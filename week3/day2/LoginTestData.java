package week3.day2;

public class LoginTestData extends TestData {
	
	public void enterUsername() {
		System.out.println("Testuser_2812@gmail.com");
	}
	public void enterPassword() {
		System.out.println("pw$123");
	}

	public static void main(String[] args) {
		
		LoginTestData ltd = new LoginTestData();
		ltd.enterCredentials();
		ltd.enterUsername();
		ltd.enterPassword();
		ltd.navigateToHomePage();
	}

}
