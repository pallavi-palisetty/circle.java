import java.util.Scanner;

public class cube
{

	public static void main(String[]args)
	
	{
		Scanner s = new Scanner(System.in);

			System.out.println("enter an integer");
			int n= s.nextInt();

			for(int i=0;i<=n;i++)
				System.out.println("the cube of "+i+" is "+(i*i*i));
	}
}