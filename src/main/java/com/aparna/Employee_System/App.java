package com.aparna.Employee_System;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        
        Department dept = (Department)context.getBean(Department.class);
        dept.setId(1);
        dept.setName("development");
        
        Employee emp = (Employee)context.getBean(Employee.class);
        emp.setDpt(dept);
        emp.setEmpId(12345);
        emp.setEmpName("Aparna");
        
        System.out.println(emp);
    }
}
