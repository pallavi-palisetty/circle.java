import java.util.scanner;

public class inchconv
{

	public static void main(String[]args)
	{
		
			Scanner s=new Scanner(System.in);
			double inches, metres;

			System.out.println("enter lenth in inches"):
			inches=s.nextDouble;
			
			metres=0.0254 * inches;

			System.out.println("length in metres ="+metres);
	}
}