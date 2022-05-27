package wednesday.map;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        wednesday.map.Student student1 = new wednesday.map.Student("Gustav");
        wednesday.map.Student student2 = new wednesday.map.Student("Peter");
        String stu1id = student1.getId();
        String stu2id = student2.getId();
        Map<String, Student> mapOfStudents = new HashMap<>();
        mapOfStudents.put("1", student1);
        mapOfStudents.put("2", student2);
        //StudentDB testDb = new StudentDB(mapOfStudents);

        System.out.println(student1.getName()+student1.getId());
    }
}
