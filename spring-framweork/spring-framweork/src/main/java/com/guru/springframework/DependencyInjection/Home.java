package com.guru.springframework.DependencyInjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
@ComponentScan
public class Home {

	public static void main(String[] args) {
		var context=new AnnotationConfigApplicationContext(Home.class);
		//System.out.println(Arrays.toString(context.getBeanDefinitionNames()));
        System.out.println(context.getBean(Business.class));
	}

}
@Component
class Business
{
	// field injection
	Dependency1 dep1;
	Dependency2 dep2;
	//SetterInjection
	@Autowired
	public  void setDep1( Dependency1 dep1)
	{
		System.out.println("From setter1 injection");
		this.dep1=dep1;
	}
	@Autowired
	public  void setDep2(@Autowired Dependency2 dep2)
	{
		System.out.println("From setter2 injection");
		this.dep2=dep2;
	}
//	public Business()
//	{
//		System.out.println(this.dep1+" "+this.dep2);
//	}
	//constructor injection
	public Business(Dependency1 dep1,Dependency2 dep2)
	{
		this.dep1=dep1;
		this.dep2=dep2;
		System.out.println(dep1+"\n"+dep2);
	}
//	public String toString()
//	{
//		return this.dep1+" "+this.dep2;
//		
//	}
	
}
@Component
class Dependency1
{
	  Dependency2 d2;
	  public Dependency1(Dependency2 d2)
	  {
		  this.d2=d2;
		  System.out.println(d2);
	  }
	  
}
@Component
class Dependency2
{
	
}
