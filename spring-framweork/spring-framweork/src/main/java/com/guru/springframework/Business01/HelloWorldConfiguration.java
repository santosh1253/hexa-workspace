package com.guru.springframework.Business01;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

//Public acessor methods ,constructor
//equals,hashcode and toString() are automatically created
//introduced record in jdk 16
record Person(String names,int age,Address address)
{};
record Address(String city,int pincode) {};
@Configuration
public class HelloWorldConfiguration {
	@Bean
	public String name()
	{
		return "Guru";
	}
	@Bean
	@Primary
	public int age()
	{
		return 25;
	}
	@Bean
	@Qualifier("years")
	public int years()
	{
		return 22;
	}
	@Bean
	public Person person(@Qualifier("years")int num, @Qualifier("home")Address address,String names)
	{
		//using the existing beans by passing method calls
		//var person=new Person(name(),age(),address());
		//using the bean names
		var person1=new Person(names,num,address);
		return person1;		
	}
	@Bean(name="office")
	@Qualifier("office")
	@Primary
	public Address address1(String city,int pincode)
	{
		Address add=new Address("Jammalamadugu",234516);
		return add;
	}
	@Bean(name="home")
	@Qualifier("home")
	public Address address2(String city,int pincode)
	{
		Address add=new Address("Eluru",534451);
		return add;
	}
}
