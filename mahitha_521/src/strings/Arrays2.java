package strings;
import java.util.Scanner;
public class Arrays2 {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int a[][]= new int[n][m];
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		
		for(int i=0;i<n;i++)
		{
			if(i%2==0)
			{
			for(int j=0;j<m;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			}
			else {
					for(int j=n-1;j>=0;j--)
					System.out.print(a[i][j]+" ");
				}
			}
			System.out.println();
		}
	}

