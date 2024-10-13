package Compartor;


public class Strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*int n=13,m=4;
		int sum=n;
		while(n>=m)
		{
			int div=n/m;
			sum+=div;
			int mod=n%m;
			n=div+mod;
		}
		System.out.println(sum);
		*/
		/*for(int i=1;i<5;i++)
		{
			int c=1;
			for(int j=1;j<=i;j++)
			{
				System.out.print(c+" ");
				c=c*(i-j)/j;
			}
			System.out.println();
		}
		*/
		/*int c=0;
		String s="001";
		StringBuffer s1=new StringBuffer(s);
		StringBuffer s2=new StringBuffer(s);
		 for(int i=0;i<s.length();i++)
		 {
			 if(i%2==0 && s.charAt(i)!='0')
			 {
				 s1.setCharAt(i, '0');
			 }
			 else if(i%2!=0 && s.charAt(i)!='1')
             {
				s1.setCharAt(i, '1');
             }
			 else if(i%2==0 && s.charAt(i)!='1')
			 {
				 s2.setCharAt(i, '1');
			 }
			 else
			 {
				 s2.setCharAt(i, '0');
			 }
	      }
		 int d=0;
		 for(int i=0;i<s.length();i++)
		 {
			 if(s.charAt(i)!=s1.charAt(i))
			 {
				 c++;
			 }
			 else if(s.charAt(i)!=s2.charAt(i))
			 {
				 d++;
			 }
		 }
		 if(c>d)
	      System.out.println(d);
		 else
			 System.out.println(c);
		*/
		/*String ip="apple";
		System.out.println(ip);	
		ArrayList<String> al=new ArrayList<String>();
		ArrayList<Integer> s=new ArrayList<>();
		for(int i=0;i<ip.length();i++)
		{
			for(int j=i;j<ip.length();j++)
			{
				String x=ip.substring(i, j+1);
                if(!al.contains(x))
                {
				al.add(x);
                s.add(x.length());
                }
			}
		}
		int max=Integer.MIN_VALUE;
		for(int i=0;i<s.size();i++)
		{
			if(max<s.get(i))
			{
				max=s.get(i);
			}
		}
		int maximum=Collections.max(s);
		System.out.println(maximum);
		System.out.println(al);
		System.out.println(s);
		int idx=s.indexOf(max);
		System.out.println(al.get(idx));
		
	}*/
		
   /*ip=abcda
    a
    ab
    abc
    abcd
    b
    bc
    bcd
    c 
    cd
    d


1)class and object
2) Constructors(this keyword)
3) Inheritance & encapsulation
4) Polymorphism
5) Abstraction(Interfaces and abstract classes)
6) Collection framework

 
   op=	abcd*/
		
		String ip="apple";
		String res="";
		for(int i=0;i<ip.length();i++)
		{
			if(!res.contains(String.valueOf(ip.charAt(i)))) {
				res+=ip.charAt(i);
			}
		}
		String op="";
		int max=Integer.MIN_VALUE;
		for(int i=0;i<res.length();i++)
		{
			for(int j=i;j<res.length();j++)
			{
				String x=res.substring(i, j+1);
			    if(x.length()>max)
			    {
			    	max=x.length();
			    	op=x;
			    }		
			}
		}
		System.out.println(op);
  }	
}