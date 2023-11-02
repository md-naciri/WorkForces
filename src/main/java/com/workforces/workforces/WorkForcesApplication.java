package com.workforces.workforces;


import com.workforces.workforces.entities.Employee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class WorkForcesApplication {

    public static void main(String[] args) {

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-config.xml");
        //Employee employee1 = (Employee) applicationContext.getBean("employee1");
        Employee employee1 = applicationContext.getBean("employee1", Employee.class);

        System.out.println(employee1);
    }

}
