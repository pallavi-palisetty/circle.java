import java.util.Scanner;

public class sumdigit
{

	public static void main(String[]args)
	
	{
		Scanner s=new Scanner(System.in);

		int n,r,sum=0;		
		System.out.println("enter a number");
		n=s.nextInt();

		while(n>0)
		{
			r=n%10;
			sum=sum+r;
			n=n/10;
		}
		
		System.out.println("sum of digits is "+sum);
	}
}