package week1.day2;

public class StringPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String input="madami";
String rev="";
for(int i=input.length()-1;i>=0;i--)
{
	rev= rev+ input.charAt(i);
}
if(input.equals(rev))
{
	System.out.println("It is an palindrome");
}
else
{
	System.out.println("It is not an palindrome");
}
	}

}
