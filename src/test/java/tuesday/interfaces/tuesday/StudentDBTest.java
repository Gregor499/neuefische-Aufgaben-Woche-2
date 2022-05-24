package tuesday.interfaces.tuesday;

import monday.Student;
import monday.StudentDB;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class StudentDBTest {

    @Test
    void studentList() {
        //GIVEN
        Student student1 = new Student("Gustav");
        Student student2 = new Student("Peter");
        String stu1id = student1.getId();
        String stu2id = student2.getId();
        Student[] myTestStudents = {student1, student2};
        StudentDB testDb = new StudentDB(myTestStudents);
        //WHEN
        Student[] actual = testDb.list();
        //THEN
        assertArrayEquals(myTestStudents, actual);
    }

/*    @Test
    void givesBackId() {
        student1.setAlter(30);
        assertEquals(30, student1.getAlter());
    }

    @Test
    void ListOutput() {
        student1.setName("Gustav");
        student1.setId("30");

        assertEquals("Gustav, 30", student1.toString(student1.getName(), student1.getId()));
    }*/
}