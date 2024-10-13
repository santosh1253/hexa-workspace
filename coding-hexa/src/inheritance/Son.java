package inheritance;

public class Son extends Father{
	private int ages;
	public Son(int fage,String fname,int age)
	{
		super(fage,fname);
		this.ages=age;
	}
	public Son()
	{
		
	}
	public void display()
	{
		//super.display();
		System.out.println("From display child method ");
		//System.out.println(super.age+" "+super.name+" "+age);
	}
	public static void main(int[] args)
	{	
		Father f=new Father();
		Son s=new Son();
		Son s1=new Son(43,"Subbarao",22);
		s1.display();
		System.out.println(s1.toString());
	}
	public static void main(String[] arg)
	{	
		System.out.println("From int args");
		// Upcasting
		Father f=new Son(40,"Ramu",22);
		f.display();
		// Downcasting 
		Son s=   (Son)(f);
		// Able to acess both the methods in parent and child classes
		s.show();
		s.display();
		System.out.println(s.toString());
	}
	@Override
	public String toString() {
		return "Son [ages=" + ages + ", age=" + age + ", name=" + name + "]";
	}
}

