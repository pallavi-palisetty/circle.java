import java.util.Scanner;

public class matrix
{

	public static void main(String[]args)
	{
		Scanner s= new Scanner(System.in);

		System.out.println("enter number of rows an columns");
		int r = s.nextInt();
		int c= s.nextInt();

		int a[][]=new int[r][c];
		int b[][]=new int[r][c];
		int sum[][]=new int[r][c];
		int i,j;

		System.out.println("enter the elements of first matrix");

			for(i=0;i<r;i++)
		{

				for(j=0;j<c;j++)
			{
				a[i][j]=s.nextInt();
			}
                                System.out.println();
			
		}

		System.out.println("enter the elements of second matrix");

			for(i=0;i<r;i++)
		{

				for(j=0;j<c;j++)
			{
				b[i][j]=s.nextInt();
			}
			System.out.println();
		}


				for(i=0;i<r;i++)
		{

				for(j=0;j<c;j++)
			{
				sum[i][j]=a[i][j]+b[i][j];
				System.out.print(sum[i][j]+" ");
			}
				System.out.println();
		}	
        }
}

		
		