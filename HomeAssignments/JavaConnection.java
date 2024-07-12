package Week3.HomeAssignments;

public abstract class JavaConnection implements DatabaseConnection{
	

	public void connect()
	{
		System.out.println("Database is connected");
	}
	public void disconnect()
	{
		System.out.println("Database is Disconnected");
	}
	public void executeUpdate()
	{
		System.out.println("Database is Updated");
	}

}
