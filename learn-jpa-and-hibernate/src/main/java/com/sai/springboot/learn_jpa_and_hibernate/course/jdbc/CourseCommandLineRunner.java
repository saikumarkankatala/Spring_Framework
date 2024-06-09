package com.sai.springboot.learn_jpa_and_hibernate.course.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.sai.springboot.learn_jpa_and_hibernate.course.Course;
import com.sai.springboot.learn_jpa_and_hibernate.course.jpa.CourseJpaRepository;
import com.sai.springboot.learn_jpa_and_hibernate.course.springdatajpa.CourseSpringDataJpaRepository;

@Component
public class CourseCommandLineRunner implements CommandLineRunner{

//	@Autowired
//	private CourseJdbcRepository repo;
	
//	@Autowired
//	private CourseJpaRepository repo;
	
	@Autowired
	private CourseSpringDataJpaRepository repo;
	
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
	    repo.save(new Course(1, "Learn AWS Now!", "in28Min"));
	    repo.save(new Course(2, "Learn Devops Now!", "in28Min"));
	    repo.save(new Course(3, "Learn Java Now!", "in28Min"));
	    
	    repo.deleteById(2L);
	    
	    System.out.println(repo.findById(1L));
	    System.out.println(repo.findById(3L));

	}

}
