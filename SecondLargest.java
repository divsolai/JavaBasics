package week1.day2;

import java.util.Arrays;

public class SecondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[]= {3,2,11,4,6,7};
Arrays.sort(arr);
System.out.println("The sorted Array is "+ Arrays.toString(arr));
//for(int i=arr.length;i>0;i--)

	System.out.println("The Second largest number is " + arr[arr.length-2]);

	}

}
