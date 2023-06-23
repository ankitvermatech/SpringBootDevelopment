package com.verma.springboot.learning.databaseconn.course.springdatajpa;

import com.verma.springboot.learning.databaseconn.course.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseSpringDataJpaRepository extends JpaRepository<Course, Long> {

}
