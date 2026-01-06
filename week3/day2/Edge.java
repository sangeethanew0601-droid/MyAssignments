package week3.day2;

public class Edge extends Browser {
	
	public void takeSnap() {
		System.out.println("Taking snap from the EDGE browser");
	}
	
	public void clearCookies() {
		System.out.println("Clearing cache from the EDGE browser");
	}
	
	public static void main(String[] args) {
		Edge e= new Edge();
		System.out.println(e.browserName="Microsoft EDGE");
		System.out.println(e.browserVersion=109.0f);
		e.openURL();
		e.closeBrowser();
		e.navigateBack();
		e.takeSnap();
		e.clearCookies();
	}

}
