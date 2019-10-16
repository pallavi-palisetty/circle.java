import java.util.Scanner;

public class integer
{

		public static void main(String[]args)
	
	{
		Scanner  s= new Scanner(System.in);
		
			System.out.println("enter a number");
			int n= s.nextInt();
		
				if(n==0)
					System.out.println("entered number is zero");

				else if(n<0)
					System.out.println("entered number is negetive");
				
				else
					System.out.println("entered number is positive");
	}
}