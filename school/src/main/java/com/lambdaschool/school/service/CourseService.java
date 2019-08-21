package com.lambdaschool.school.service;

import com.lambdaschool.school.model.Course;
import com.lambdaschool.school.view.CountStudentsInCourses;

import java.util.ArrayList;
import java.util.Optional;

public interface CourseService
{
    ArrayList<Course> findAll();

    ArrayList<CountStudentsInCourses> getCountStudentsInCourse();

    void delete(long id);

    Optional<Course> findCourseById(long id);
}
