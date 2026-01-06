package week4.day1;

public class Amazon extends CanaraBank {

	@Override
	public void cashOnDelivery() {
		System.out.println("Implementing cash on delivery defined in Interface");
		
	}

	@Override
	public void upiPayments() {
		System.out.println("Implementing upiPayments defined in Interface");
		
	}

	@Override
	public void cardPayments() {
		System.out.println("Implementing card payments defined in Interface");
		
	}

	@Override
	public void internetBanking() {
		System.out.println("Implementing internetBanking defined in Interface");
		
	}
	
	public static void main(String[] args) {
		Amazon a = new Amazon();
		a.cashOnDelivery();
		a.upiPayments();
		a.cardPayments();
		a.internetBanking();
		a.recordPaymentDetails();
		}
	}
