package tuesday.arrayList;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class StudentDBTest {

    @Test
    void studentList() {
        //GIVEN
        tuesday.arrayList.Student student1 = new tuesday.arrayList.Student("Gustav");
        tuesday.arrayList.Student student2 = new tuesday.arrayList.Student("Peter");
        String stu1id = student1.getId();
        String stu2id = student2.getId();
        ArrayList<tuesday.arrayList.Student> myTestStudents = new ArrayList<>();
        myTestStudents.add(student1);
        myTestStudents.add(student2);
        tuesday.arrayList.StudentDB testDb = new StudentDB(myTestStudents);
        //WHEN
        ArrayList<tuesday.arrayList.Student> actual = testDb.list();
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