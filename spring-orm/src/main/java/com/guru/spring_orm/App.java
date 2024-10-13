package com.guru.spring_orm;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context=new ClassPathXmlApplicationContext("hibernate.xml");
        StudentDao dao=context.getBean(StudentDao.class);
        Student s=new Student(2,"Bharathii");
         int n= dao.saveStudent(s);
         System.out.println("Saved Successfully....!");
        
    }
}
