package org.example;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Data
public class UniversityService {

    public double averageCourseGrade(Course course) {
        int gradeCount = 0;
        for (Student student : course.getStudents()) {
            gradeCount += student.getGrade();
        }
        return (double) gradeCount / course.getStudents().size();
    }

    public double averageUniversityGrade(List<Course> courses) {
        int gradeCount = 0;
        int studentCount = 0;
        for (Course course : courses) {
            for (Student student : course.getStudents()) {
                gradeCount += student.getGrade();
                studentCount += 1;
            }
        }
        return (double) gradeCount / studentCount;
    }

    public List<Student> retrieveAllStudents(University university) {
        List<Student> newStudentList = new ArrayList<>();
        for (Course course : university.courses()) {
            for (Student student : course.getStudents()) {
                if(student.getGrade() >= 2) {
                    newStudentList.add(student);
                }
            }
        }
        return newStudentList;
    }


}
