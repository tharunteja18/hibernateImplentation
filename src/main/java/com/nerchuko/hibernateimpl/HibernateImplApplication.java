package com.nerchuko.hibernateimpl;

import com.nerchuko.hibernateimpl.Repository.StudentRepository;
import com.nerchuko.hibernateimpl.Service.serviceClass;
import com.nerchuko.hibernateimpl.model.Laptop;
import com.nerchuko.hibernateimpl.model.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class HibernateImplApplication {

	public static void main(String[] args) {

		ConfigurableApplicationContext context = SpringApplication.run(HibernateImplApplication.class, args);

		serviceClass s1 = context.getBean(serviceClass.class);
		s1.addStudent();

	}

}
