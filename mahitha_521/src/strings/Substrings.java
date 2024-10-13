package strings;
import java.util.ArrayList;
import java.util.Scanner;
public class Substrings {

public static void main(String args[])
   {
	  Scanner sc=new Scanner(System.in);
	  String sb=sc.nextLine();
	  ArrayList<String> al=new ArrayList<String>();
	  ArrayList<String> bl=new ArrayList<String>();
	  for(int i=0;i<sb.length();i++)
	  {
		  for(int j=i;j<sb.length();j++)
		  {
			  String x=sb.substring(i,j+1);
			  bl.add(x);
			  if(!al.contains(x))
			  {
				al.add(x);
			  }
		  }
	  }
	  int max=Integer.MIN_VALUE;
	  String res="";
	  for(int i=0;i<al.size();i++)
	  {
		 int x=al.get(i).length();
		 if(max<x)
		 {
			 max=x;
			 res=al.get(i);
		 }
	  }
	  System.out.println(al);
	  
	  System.out.println(bl);
	  
   }
}
