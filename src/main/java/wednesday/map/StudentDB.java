package wednesday.map;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class StudentDB {
    private Map<String, Student> allMyStudents = new HashMap<>();

    public StudentDB(ArrayList<Student> allMyStudents) {
        for (int i = 0; i < allMyStudents.size(); i++)
        this.allMyStudents.put(allMyStudents.get(i).getId(), allMyStudents.get(i));
    }

    public Collection<Student> list() {
        return allMyStudents.values();
    }

    @Override
    public String toString() {
        return "StudentDB{" +
                "allMyStudents=" + allMyStudents +
                '}';
    }

/*    public Student randomStudent(){
        Math.random();
        return;
    }*/
    }

