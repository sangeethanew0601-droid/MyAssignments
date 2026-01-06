package week4.day1;

public abstract class MySqlConnection implements DatabaseConnection {
	
	public void connect() {
		System.out.println("Connecting from MySql");
		}
	
	public void disconnect() {
		System.out.println("Disconnecting from MySql");
	}
	
	public void executeUpdate() {
		System.out.println("Exceute update");
	}
	
	public abstract void executeQuery();
	}
