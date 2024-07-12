package Week3.HomeAssignments;

import java.util.Arrays;

public class SortingArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String[] cName =  {"HCL", "Wipro", "Aspire Systems", "CTS"};
Arrays.sort(cName);
int len=cName.length;

for(int i=(len-1);i<=0;i--)
{
	System.out.println(cName[i]);
}
	}

}
