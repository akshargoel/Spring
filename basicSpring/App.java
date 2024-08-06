package com.springcore.springcore;

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
        System.out.println( "Hello World!" );
        ApplicationContext context= new ClassPathXmlApplicationContext("config.xml");
        Employee emp1= (Employee) context.getBean("employee1");
        System.out.print(emp1.getCourses());
    }
}
