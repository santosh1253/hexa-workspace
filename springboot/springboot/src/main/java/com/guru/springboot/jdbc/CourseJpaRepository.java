package com.guru.springboot.jdbc;

import org.springframework.stereotype.Repository;

import com.guru.springboot.controller.Course;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class CourseJpaRepository {

	@PersistenceContext
	 private EntityManager em;
	
	 public void insert(Course c)
	 {
		 em.merge(c);
	 }
	 public Course findById(int id)
	 {
		return em.find(Course.class, id);
	 }
	 public void deleteById(int id)
	 {
		 Course c=em.find(Course.class, id);
		 em.remove(c);
	 }
}
