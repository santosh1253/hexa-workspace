package mypackage;
class A
{
     public String a="rahul";
     public int marks=52;
     public int roll=4236;
     public void homework()
     {
    	 System.out.println("he can work");
     }
     public void sleep()
     {
    	 System.out.println("he can sleep");
     }
     
     
     public static void main(String[] args)
     {
    	 A obj=new A();
    	 obj.sleep();
    	 System.out.println(obj.marks);
     }
}