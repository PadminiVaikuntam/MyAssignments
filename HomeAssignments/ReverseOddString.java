package Week3.HomeAssignments;
public class ReverseOddString {
	public static void main(String[] args) {
String str="I am a software tester and working";
String[] str1=str.split(" ");
String output=" ";
for(int i=0;i<=str1.length-1;i++)
{
	if(i%2==1)
	{
		char[] cstr=str1[i].toCharArray();
		String output2 = " ";
		int len=cstr.length;
		for(int j=(len-1);j>=0;j--)
					output2=output2 + cstr[j];
		
		str1[i]=output2;
	}
	output=output+" "+str1[i];
}
System.out.println("final output is " + output);
	}
}