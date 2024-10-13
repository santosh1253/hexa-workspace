package strings;
public class Methodoverloading {
	int a;
	int b;
	public int add(int a,int b)
	{
		return a+b;
	}
	public double add(int a,double b)
	{
		return a*b;
	}
	public static void main(String[] args) {
		Methodoverloading ob=new Methodoverloading();
		int res1=ob.add(5, 2);
		double res2=ob.add(2, 7.0);
		System.out.println(res1+" "+res2);
	}
}
