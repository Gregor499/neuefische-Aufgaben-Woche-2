package wednesday.exception;

import java.util.*;
import java.util.stream.Collectors;

public class StudentDB {

    private Map<String, Student> allMyStudents = new HashMap<>(
    );

    public StudentDB(List<Student> students) {
        for (int i = 0; i < allMyStudents.size(); i++) {
            this.allMyStudents.put(allMyStudents.get(i).getId(), allMyStudents.get(i));
        }
    }

    public Collection<Student> list() {
        return allMyStudents.values();
    }

    public Student randomStudent() {
        int index = (int) (Math.random() * allMyStudents.size());
        return new ArrayList<>(allMyStudents.values()).get(index);
    }

    @Override
    public String toString() {
        return "[" + allMyStudents.values().stream().map(Object::toString).collect(Collectors.joining(", ")) + "]";
    }

    public void add(Student newStudent) {
        allMyStudents.put(newStudent.getId(), newStudent);
    }

    public void removeById(String id) {
        allMyStudents.remove(id);
    }
}