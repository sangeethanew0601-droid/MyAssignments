package week3.day2;

public class Elements extends Button {

	public static void main(String[] args) {
		Elements el = new Elements();
		el.click();
		el.setText("Setting text from the Elements class");
		el.submit();
		
		CheckBoxButton cbc = new CheckBoxButton();
		cbc.clickCheckButton();
		
		RadioButton rb = new RadioButton();
		rb.selectRadioButton();
		
		TextField tf = new TextField();
		System.out.println(tf.getText());
		}
}
