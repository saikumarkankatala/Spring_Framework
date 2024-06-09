package com.sai.springboot.learn_jpa_and_hibernate.course.jpa;

import org.springframework.stereotype.Repository;
import com.sai.springboot.learn_jpa_and_hibernate.course.Course;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class CourseJpaRepository {
	
	@PersistenceContext
	private EntityManager manager;
	
	public void insert(Course course) {
		manager.merge(course);
	}
	
	public Course findById(long id) {
		return manager.find(Course.class, id);
	}
	
	public void deleteByID(long id) {
		Course course = manager.find(Course.class, id);
		manager.remove(course);
	}
}
