package com.fran.restws;


import java.util.List;

import javax.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Autowired;

import com.fran.restws.entities.Course;
import com.fran.restws.repos.CourseRepository;

public class CourseServiceImpl implements CourseService {
	
	@Autowired
	CourseRepository repository;
	int currentId = 123;
	
	@Override
	public List<Course> getCourses() {
		return repository.findAll();
	}

	@Override
	public Course getCourse(int id) {
		return repository.findById(id).get();
	}

	@Override
	public Response createCourse(Course course) {
		Course saveCourse = repository.save(course);
		return Response.ok(saveCourse).build();
	}

	@Override
	public Response updateCourse(Course course) {
		Course updateCourse = repository.save(course);
		return Response.ok(updateCourse).build();
	}
	@Override
	public Response deleteCourse(int id) {
		Course currentCourse = repository.findById(id).get();
		Response response;
		if(currentCourse != null) {
			repository.delete(repository.findById(id).get());
			response = Response.ok().build();
		}else {
			response = Response.notModified().build();
		}
		return response;
	}

}
