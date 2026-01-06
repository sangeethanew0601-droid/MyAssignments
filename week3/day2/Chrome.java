package week3.day2;

public class Chrome extends Browser {
	
	public void openIncognito() {
		System.out.println("Opening incognito window from Google Chrome");
	}
	
	public void clearCache() {
		System.out.println("Clearing cache from the Google Chrome");
	}
	
	public static void main(String[] args) {
		Chrome c = new Chrome();
		System.out.println(c.browserName="Google Chrome");
		System.out.println(c.browserVersion=108.0f);
		c.openURL();
		c.closeBrowser();
		c.navigateBack();
		c.openIncognito();
		c.clearCache();
	}

}
