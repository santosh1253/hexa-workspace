package Compartor;

import java.io.Serializable;

public class Employee implements Serializable{
	private String name;
	private transient Integer id;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Employee(String name, Integer id) {
		super();
		this.name = name;
		this.id = id;
	}
  ///Comparable interface 
	public int compareTo(Employee o) {
//		if(this.getId()<o.getId())
//			return 1;
//		else if(this.getId()>o.getId())
//			return -1;
//	    return 0;
		// using Integer compareTo() method
		return this.getName().compareTo(o.getName());
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + "]";
	}
	

}
