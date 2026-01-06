package week1.day2;

public class EdgeBrowser {

	public static void main(String[] args) {
		Browser obj = new Browser();
		System.out.println("Browser Name: "+obj.launchBrowser("Microsoft EDGE"));
		System.out.println(obj.loadUrl("Url loaded successfully"));
}

}
