package model;

import model.Student;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Gustav");

        student1.setName("Gustav");
        student1.setId("33");

        System.out.println(student1.getName() + ", " +
                student1.getId());
    }
}
