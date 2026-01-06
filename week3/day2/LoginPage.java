package week3.day2;

public class LoginPage extends BasePage {
	
	@Override
	public void performCommonTasks() {
		System.out.println("Overridden method: Load the application URL, Enter Username, Enter Password and login");
	}

	public static void main(String[] args) {
		
		BasePage bp = new BasePage();
		bp.performCommonTasks();
		LoginPage lp = new LoginPage();
		lp.findElement();
		lp.clickElement();
		lp.enterText();
		lp.performCommonTasks();
}
}
