package week1.day1;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int range=8;
int firstnum=0;
int secondNum=1;
for(int i=1;i<=range;i++)
{
	System.out.println(firstnum);
	int sum=firstnum+secondNum;
	firstnum=secondNum;
	secondNum=sum;
}
	}

}
