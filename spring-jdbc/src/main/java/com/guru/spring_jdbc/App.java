package com.guru.spring_jdbc;

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
      ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
      StudentDao dao=context.getBean(StudentDao.class);
      int res=dao.saveStudent(new Student("Rampandu",49));
      System.out.println(res+" row(s) inserted Succesfully....!");
      dao.getAllStudents(res);
    }
}
