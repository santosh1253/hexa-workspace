package com.guru.springframework.Business01;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
@Qualifier("mysql")
public class MySqlService implements DataService{
    public MySqlService()
    {
    	System.out.println("From Mysql");
    }
	@Override
	public int[] retriveData() {
		return new int[] {20,30,40,50,60};
	}
    
}
