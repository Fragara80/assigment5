package com.fran.restws;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import com.fran.restws.entities.Course;

@Consumes("application/json")
@Produces("application/json")
@Path("/courseservice")
public interface CourseService {
	
	@Path("/courses")
	@GET
	List<Course> getCourses();
	
	@Path("/courses/{id}")
	@GET
	Course getCourse(@PathParam("id")int id);
	
	@Path("/courses")
	@POST
	Response createCourse(Course course);
	
	@Path("/courses")
	@PUT
	Response updateCourse(Course course);
	
	@Path("/courses/{id}")
	@DELETE
	Response deleteCourse(@PathParam("id") int id);

}
