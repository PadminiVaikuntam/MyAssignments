package Week3.HomeAssignments;

public class StringoddChangecase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String test = "changeme";

char[] test1 = test.toCharArray();
for(int i=0;i<=test1.length-1;i++)
{
	if(i%2==1)
		System.out.println("Char fount at index "+ i +" is "+ Character.toUpperCase(test1[i]));
		else
	System.out.println("Char fount at index "+ i +" is "+test1[i]);
}
	}

}
