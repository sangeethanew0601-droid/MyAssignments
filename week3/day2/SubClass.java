package week3.day2;

public class SubClass extends SuperClass {
	
	@Override
	public String paymentType(String payByRedefined)
	{
	 return payByRedefined;
	}
	
	public static void main(String[] args) {
	SuperClass sup = new SuperClass();
	System.out.println(sup.paymentType("Payment can be done only through GPAY or PhonePay"));
	SubClass sbc = new SubClass();
	System.out.println(sbc.paymentType("Credit card payment can also be done now"));
		
	}

}
