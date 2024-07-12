package Week3.HomeAssignments;

import java.util.Arrays;

public class SecondLargestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int myArr[] = {3, 2, 11, 4, 6, 7};
		Arrays.sort(myArr);
		System.out.println("The second largest number in the given array is " + myArr[myArr.length-2]);
		
		
	}

}
