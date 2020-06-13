package week1.day1;

public class SumOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num=564556,quo,rem;
int sum=0;
for(int i=0;i<=num;i++)
{
	quo=num/10;
	rem=num%10;
	sum=sum+rem;
	num=quo;
}
System.out.println(sum);

	}

}
