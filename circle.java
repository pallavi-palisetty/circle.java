import java.lang.Math;
import java.util.Scanner;
public class circle
{
	public static void main(String[]args)
	{
		Scanner s = new Scanner(System.in);
		
			System.out.println("enter the radius of the circle");
			float r=s.nextInt();

				float  area =(float) (Math.PI *r*r);
				float peri=(float) (2*Math.PI*r);
			System.out.println("area="+area+"peri="+peri);
	}
}