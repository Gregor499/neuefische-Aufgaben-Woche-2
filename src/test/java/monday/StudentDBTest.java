package monday;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class StudentDBTest {

    @Test
    void studentList() {
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