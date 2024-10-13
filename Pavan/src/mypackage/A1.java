package mypackage;

class A1 {
	public String name;
	public float marks;
	public int roll;
	private boolean present;

	public void homework() {
		System.out.println("he can work");
	}

	public void sleep() {
		System.out.println("he can sleep");
	}

	public static void main(String[] args) {
		A1 obj = new A1();
		// We can set values(properties)
		obj.name = "Pavan";
		obj.marks = 263;
		obj.roll = 22;
		obj.present = true;
		System.out.println(obj.marks + " " + obj.name + " " + obj.roll + " " + obj.present);
		A1 obj1 = new A1();
		obj1.marks = 255;
		obj1.name = "guru";
		obj1.present = false;
		obj1.roll = 4236;
		obj1.sleep();
		obj.sleep();
		System.out.println(obj1.marks + " " + obj1.name + " " + obj1.roll + " " + obj1.present);
	}
}