package strings;

import java.util.Scanner;

public class Tree {
public static void main(String args[])
	{
      Scanner s=new Scanner(System.in);
      int n=s.nextInt();
      int x=s.nextInt();
      int t=s.nextInt();
      int arr[]=new int[2*n];
      for(int i=0;i<arr.length;i++)
      {
    	  arr[i]=s.nextInt();
      }
      System.out.println(steelDocs(n,x,t,arr));

      
	}
 public static String steelDocs(int input1,int input2,int input3,int[] input4)
 {
	 int diff=0;
	 for(int i=1,j=2;i<input4.length&& j<input4.length;i+=2,j+=2)
     {
   	  diff+=Math.abs(input4[i]-input4[j]);
     }
     int size=input4.length;
     if(input4[size-1]!=input3)
     {
   	  diff+=Math.abs(input4[size-1]-input3);
     }
     if(input2<=diff) {
   	  return "Possible"+" "+String.valueOf(diff);
     }
	return "Impossible"+" "+"0";
	 
 }
}

