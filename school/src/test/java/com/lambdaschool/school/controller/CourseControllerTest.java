package com.lambdaschool.school.controller;

import com.lambdaschool.school.model.Course;
import com.lambdaschool.school.model.Instructor;
import com.lambdaschool.school.model.Student;
import com.lambdaschool.school.service.CourseService;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import java.util.ArrayList;
import java.util.List;

@RunWith(SpringRunner.class)
@WebMvcTest(value = CourseController.class, secure = false)
public class CourseControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private CourseService courseService;
    private List<Course> courseList;

    @Before
    public void setUp(){
        courseList = new ArrayList<>();

        Instructor i1 = new Instructor("Sally");
        Instructor i2 = new Instructor("Lucy");
        Instructor i3 = new Instructor("Charlie");
        instructrepos.save(i1);
        instructrepos.save(i2);
        instructrepos.save(i3);
        Course c1 = new Course("Data Science", i1);
        Course c2 = new Course("JavaScript", i1);
        Course c3 = new Course("Node.js", i1);
        Course c4 = new Course("Java Back End", i2);
        Course c5 = new Course("Mobile IOS", i2);
        Course c6 = new Course("Mobile Android", i3);
        c1.setCourseid(1);
        c2.setCourseid(2);
        c3.setCourseid(3);
        c4.setCourseid(4);
        c5.setCourseid(5);
        c6.setCourseid(6);
        c1 = courseService.save(c1);
        c2 = courseService.save(c2);
        c3 = courseService.save(c3);
        c4 = courseService.save(c4);
        c5 = courseService.save(c5);
        c6 = courseService.save(c6);
        Student s1 = new Student("John");
        s1.getCourses().add(courseService.findCourseById(c1.getCourseid()));
        s1.getCourses().add(courseService.findCourseById(c4.getCourseid()));
        Student s2 = new Student("Julian");
        s2.getCourses().add(courseService.findCourseById(c2.getCourseid()));
        Student s3 = new Student("Mary");
        s3.getCourses().add(courseService.findCourseById(c3.getCourseid()));
        s3.getCourses().add(courseService.findCourseById(c1.getCourseid()));
        s3.getCourses().add(courseService.findCourseById(c6.getCourseid()));
        studentService.save(s1);
        studentService.save(s2);
        studentService.save(s3);
    }
    }
}
