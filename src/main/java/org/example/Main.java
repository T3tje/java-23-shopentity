package org.example;

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
    }
}