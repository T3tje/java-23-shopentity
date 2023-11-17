package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // builder testen
        Student student1 = Student.builder()
                .name("Hans Peter Vogel")
                .address("Baumgasse 6")
                .id(1)
                .grade(5)
                .build();
        System.out.println(student1); // To String testen
        System.out.println(student1.getId()); // getter testen
        // Setter testen
        student1.setAddress("Blumenweg 10");
        System.out.println(student1);

        Student student2 = Student.builder()
                .name("Inge Meier")
                .address(("Waldweg 88"))
                .id(5)
                .grade(4)
                .build();

        List<Student> students = new ArrayList<Student>();
        students.add(student2);

        System.out.println("========================================");
        //Builder und Records testen
        Teacher teacher1 = Teacher.builder()
                .id(4)
                .name("Herbert Meier")
                .subject("Mathematik")
                .build();

        System.out.println(teacher1); //toString testen
        System.out.println(teacher1.id()); // getter testen
        //Setter testen
        teacher1 = teacher1.withName("Hubert Müller");
        System.out.println(teacher1);

        System.out.println("======================================");

        //Course anlegen
        Course course1 = Course.builder()
                .id(1)
                .name("Mathematik")
                .teacher(teacher1)
                .students(students)
                .build();

        //zweiten Course anlegen
        Course course2 = Course.builder()
                .id(2)
                .name("Deutsch")
                .teacher(teacher1)
                .students(students)
                .build();

        System.out.println(course1); //toString testen
        System.out.println(course2.getStudents()); //getterTesten

        //average CourseGrade method testen
        UniversityService universityService1 = new UniversityService();
        System.out.println(universityService1.averageCourseGrade(course1));


        // KursListe anlegen
        List<Course> courses = new ArrayList<>();
        courses.add(course1);
        courses.add(course2);

        //University anlegen
        University university1 = University.builder()
                .id(1)
                .name("FAU")
                .courses(courses)
                .build();

        // averageUniversityGrade testen
        System.out.println(universityService1.averageUniversityGrade(university1.courses()));

        // retrieveAllStudents testen
        System.out.println(universityService1.retrieveAllStudents(university1));
    }
}