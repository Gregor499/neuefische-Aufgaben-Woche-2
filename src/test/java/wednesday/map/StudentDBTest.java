package wednesday.map;

import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StudentDBTest {

    @Test
    void studentList() {
        //GIVEN
        Student student1 = new Student("Gustav");
        Student student2 = new Student("Peter");
        ArrayList<Student> myTestStudents = new ArrayList<>();
        myTestStudents.add(student1);
        myTestStudents.add(student2);
        StudentDB testDb = new StudentDB(myTestStudents);
        //WHEN
        Collection<Student> actual = testDb.list();
        //THEN
        assertEquals(myTestStudents, actual);
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