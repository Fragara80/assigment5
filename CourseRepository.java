package com.fran.restws.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fran.restws.entities.Course;

public interface CourseRepository extends JpaRepository<Course, Integer> {

}
