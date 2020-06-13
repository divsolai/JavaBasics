package week1.day2;

import java.util.Arrays;

public class MissingElementInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int input[]= {1,2,3,4,7,6,8};
Arrays.sort(input);
//System.out.println(input);
for(int i=1;i<input.length;i++)
{
	if(i!=input[i-1])
	{
		System.out.println(i);
		break;
	}
}

	}

}
