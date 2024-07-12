package Week3.HomeAssignments;

import io.opentelemetry.api.internal.StringUtils;

public class DuplicateElimination {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String text="We learn Java basics as part of java sessions in java week1";
String[] text2 = text.split(" ");
String text1=" ";
int count=0;
String text3="";
for(int i=0; i<text2.length;i++)
{
	for(int j=i+1;j<text2.length-1;j++)
	{
		if(text2[i].equalsIgnoreCase(text2[j]))
		{
			count++;
		text3=text2[i];

		}
	}
}
if(count>1)	
{
	for(int k=0;k<text2.length;k++)
	{
		if(text2[k].equalsIgnoreCase(text3))
					text=text.replaceAll(text3, " ");
		
}
}
System.out.println(text);
	}
}