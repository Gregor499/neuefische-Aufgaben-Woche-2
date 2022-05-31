package tuesday.interfaces;

import monday.Student;
import monday.StudentDB;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StudentDBTest {

    @Test
    void shouldPutAllMyStudentsPlusIdIntoAString() {
        //GIVEN
        Student student1 = new Student("Gustav");
        Student student2 = new Student("Peter");
        Student[] myTestStudents = {student1, student2};
        StudentDB testDb = new StudentDB(myTestStudents);
        String expected = "Unsere Schüler:\n[Student{name='" + student1.getName() + "', " +
                "id='" + student1.getId() +
                "'}, Student{name='"+ student2.getName() + "', " +
                "id='" + student2.getId() + "'}]";

        //WHEN
        String actual = testDb.toString();
        //THEN
        assertEquals(expected, actual);
    }

    @Test

    void oneStudentShouldBeAdded(){
        //GIVEN
        Student student1 = new Student("Gustav");
        Student student2 = new Student("Peter");

        Student[] myTestStudents = {student1, student2};
        StudentDB testDb = new StudentDB(myTestStudents);

        Student student3 = new Student("lal");
        //WHEN
        testDb.addStudent(student3);

        Student[] actual = testDb.list();
        int expected = 3;
        //THEN
        assertEquals(expected, actual.length);
        Student newStudent = actual[2];
        assertEquals("lal", newStudent.getName());
    }

    @Test

    void certainStudentShouldBeRemoved(){
        //GIVEN
        Student student1 = new Student("Gustav");
        Student student2 = new Student("Peter");

        String removeId = student2.getId();

        Student[] myTestStudents = {student1, student2};
        StudentDB testDb = new StudentDB(myTestStudents);
        //WHEN
        testDb.removeStudent(removeId);
        Student[] actual = testDb.list();
        int expected = 1;
        //THEN
        assertEquals(expected, actual.length);
        assertNotEquals("Peter", actual[0].getName());
        System.out.println(testDb.toString());
    }

    @Test

    void certainStudentShouldBeRemovedInTheMiddle(){
        //GIVEN
        Student student1 = new Student("Gustav");
        Student student2 = new Student("Peter");
        Student student3 = new Student("Magnus");

        String removeId = student2.getId();

        Student[] myTestStudents = {student1, student2, student3};
        StudentDB testDb = new StudentDB(myTestStudents);
        //WHEN
        testDb.removeStudent(removeId);
        Student[] actual = testDb.list();
        int expected = 2;
        //THEN
        assertEquals(expected, actual.length);
        assertNotEquals("Peter", actual[0].getName());
        assertNotEquals("Peter", actual[1].getName());
        System.out.println(testDb.toString());
    }

    @Test

    void certainStudentShouldBeRemovedIdNotKnown(){
        //GIVEN
        Student student1 = new Student("Gustav");
        Student student2 = new Student("Peter");
        Student student3 = new Student("Magnus");

        Student[] myTestStudents = {student1, student2, student3};
        StudentDB testDb = new StudentDB(myTestStudents);
        //WHEN
        testDb.removeStudent("notKnownId");
        Student[] actual = testDb.list();
        int expected = 3;
        //THEN
        assertEquals(expected, actual.length);
        System.out.println(testDb.toString());
    }
}