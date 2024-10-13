package com.guru.springframework.Business;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class MongoDb implements DataService {
     
	MongoDb()
	{
		System.out.println("from mongodb");
	}
	@Override
	public int[] retriveData() {
		
		return new int[] {2,3,4,5,6};
	}

}
