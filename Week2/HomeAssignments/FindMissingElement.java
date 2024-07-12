package Week2.HomeAssignments;

import java.util.Arrays;

public class FindMissingElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 int a[]={1,4,3,2,8,6,7}; 
	       Arrays.sort(a);
	        for(int i=0; i<(a.length)-1;++i)
	        {
	               	    if(a[i]!=(i+1))
	        	      	{
       	      	     	System.out.println("The missing number is "+ (i+1));
	        	      	break;
	        	      	}
	}
}
}