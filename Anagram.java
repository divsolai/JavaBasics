package week1.day2;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String text1="stops";
String text2="stods";

if(text1.length()==text2.length())
{
 char[] array1 = text1.toCharArray();
 Arrays.sort(array1);
 System.out.println(array1);
 
 char[] array2 = text2.toCharArray();
 Arrays.sort(array2);
 System.out.println(array2);
 
 if (Arrays.equals(array1, array2))
 {
	 System.out.println("It is an anagram");
	}
 else
 {
	 System.out.println("It is not an anagram");
 }
}

else
{
	System.out.println("String length is different");
}

	}

}
