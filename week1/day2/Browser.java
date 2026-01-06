package week1.day2;

public class Browser {
	
	String launchBrowser(String browserName) {
		return browserName;
	}
	
	String loadUrl(String URL) {
		return URL;
		
	}

	public static void main(String[] args) {
		Browser obj = new Browser();
		System.out.println("Browser Name: "+obj.launchBrowser("Google Chrome"));
		System.out.println(obj.loadUrl("Url loaded successfully"));

	}

}
