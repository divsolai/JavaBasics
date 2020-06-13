package week1.day2;

public class OddUpperCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String text="changeme";
String finalstring= " ";
char[] textarr = text.toCharArray();
for(int i=0;i<textarr.length;i++)
{
	if(i%2==0)
	{
		char upperCase = Character.toUpperCase(textarr[i]);
	    finalstring= finalstring+upperCase;
	}
	else
	{
	 char c = textarr[i];
		finalstring= finalstring+c;
	}
}
System.out.println(finalstring);
	}

}
