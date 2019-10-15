import java.util.Scanner;

public class binadd
        
{

	public static void main(String[] args)
	{
		Scanner s= new Scanner(System.in);
		long bin1,bin2;
		int sum[]=new int[10];
		int i=0,rem=0;

		System.out.println("enter the 2 binary numbers");
		bin1=s.nextLong();
		bin2=s.nextLong();

		while(bin1!=0 || bin2!=0)
	{
		
			sum[i++]=(int) ((bin1 % 10 + bin2 % 10 + rem)%2);
			rem =(int) ((bin1 % 10 + bin2 % 10 + rem)/2);
			bin1=bin1/10;
			bin2=bin2/10;
	}
		if(rem!=0)
		sum[i]=rem;
		System.out.println("the sum of the binary numbers");

		while(i>=0)
		{
			System.out.print(sum[i]);
				i--;
		}
	}
}