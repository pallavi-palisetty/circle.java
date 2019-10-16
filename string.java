import java.util.Scanner;
import java.lang.String;

public class string
{
	public static void main(String[]args)
	{
		
		Scanner s= new Scanner(System.in);
		
			System.out.println("enter a string");
			String str = s.nextLine();
				int c=0;

			for(int i = 0; i<str.length();i++)
			{
				if(str.charAt(i)=='a'|| str.charAt(i)== 'e' ||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u')
					c++;
			}
			
				System.out.println("the number of vowels are "+c);
	}
}