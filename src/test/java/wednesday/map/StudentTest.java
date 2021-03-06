package wednesday.map;

import org.junit.jupiter.api.Test;
import tuesday.arrayList.Student;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class StudentTest {
    Student student1 = new Student("");

    @Test
    void givesBackName() {
        student1.setName("Gustav");
        assertEquals("Gustav", student1.getName());
    }

    @Test
    void givesBackId() {
        student1.setId("30");
        assertEquals("30", student1.getId());
    }

    @Test
    void propertyOutput() {
        student1.setName("Gustav");
        student1.setId("30");
        assertEquals("Gustav, 30", student1.toString(student1.getName(), student1.getId()));
    }
}