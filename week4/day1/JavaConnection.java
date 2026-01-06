package week4.day1;

public class JavaConnection extends MySqlConnection {

	@Override
	public void connect() {
		System.out.println("Connect to database with Java imp");
	}

	@Override
	public void disconnect() {
		System.out.println("Disconnect from database with Java imp");
	}

	@Override
	public void executeUpdate() {
		System.out.println("Execute update with Java imp");
		
	}
	
	@Override
	public void executeQuery() {
		System.out.println("Execute query method defined in Abstract class");
		
	}
	
	public static void main(String[] args) {
		JavaConnection JC = new JavaConnection();
		JC.connect();
		JC.disconnect();
		JC.executeUpdate();
		JC.executeQuery();
	}
}
