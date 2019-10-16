import java.util.Scanner;

public class minconv
{
		public static void main(String[] args)
	{

		Scanner s= new Scanner(System.in);

		long min; int years,days;

		System.out.println("enter number of minutes");
		min=s.nextLong();
		
		years=(int) (min/(24*60*365));
		days=(int) ((min/(24*60))%365);

		System.out.println("the given minutes"+min+" is "+years+" years and "+days+" days ");
	}
}