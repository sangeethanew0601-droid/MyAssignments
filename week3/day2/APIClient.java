package week3.day2;

public class APIClient {
	
	public void sendRequest(String endPoint) {
		System.out.println("Endpoint is: " +endPoint);
	}
	
	public void sendRequest(String endPoint, String requestBody, boolean requestStatus) {
		System.out.println("Endpoint is: " +endPoint +", " +"Request Body is: " +requestBody +", " +"and" +" "+"RequestStatus is: " +requestStatus);
		
	}

	public static void main(String[] args) {
		
		APIClient ac = new APIClient();
		ac.sendRequest("Test Endpoint");
		ac.sendRequest("Test Endpoint_1", "Test Request Body", true);

	}
}
