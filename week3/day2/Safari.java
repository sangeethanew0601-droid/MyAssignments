package week3.day2;

public class Safari extends Browser {
	
	public void readerMode() {
		System.out.println("Enable reading mode in Safari browser"); 
	}
	
	public void fullScreenMode() {
		System.out.println("Enable full screen in Safari browser");
	}

    public static void main(String[] args) {
    	Safari s= new Safari();
    	System.out.println(s.browserName="Safari");
    	System.out.println(s.browserVersion=16.1f);
		s.openURL();
		s.closeBrowser();
		s.navigateBack();
		s.readerMode();
		s.fullScreenMode();
	}
}
