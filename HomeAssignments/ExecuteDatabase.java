package Week3.HomeAssignments;

public class ExecuteDatabase extends JavaConnection{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ExecuteDatabase ED=new ExecuteDatabase();
ED.connect();
ED.disconnect();
ED.executeUpdate();
	}

}
