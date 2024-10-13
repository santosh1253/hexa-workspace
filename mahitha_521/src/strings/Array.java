package strings;
import java.util.Scanner;
public class Array {
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter size:");
	int n=sc.nextInt();
	int a[]=new int[n];

	for(int i=0;i<=n-1;i++)
	{
		a[i]=sc.nextInt();
	}
	for(int i=0;i<=n-1;i++)
	{
		System.out.println(a[i]);
	}
	int max=a[0];
	int min=a[0];
	for(int i=0;i<=n-1;i++)
	{
		if(max<a[i])
		{
			max=a[i];
		}
		else
		{
			min=a[i];
		}
	}
	System.out.println(max);
	System.out.println(min);
	}
}
