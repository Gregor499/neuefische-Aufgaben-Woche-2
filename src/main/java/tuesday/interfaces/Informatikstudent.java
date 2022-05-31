package tuesday.interfaces;

import java.util.UUID;

public class Informatikstudent implements Student {

    private final BaseStudent baseStudent;

    public Informatikstudent(String name) {
        baseStudent = new BaseStudent(name);
    }

    public String getName() {
        return baseStudent.getName();
    }

    public String getId() {
        return baseStudent.getId();
    }

    public String getSubject() {
        return "Informatik";
    }

    public void setName(String name) {
        baseStudent.setName(name);
    }

    public void setId(String id) {
        baseStudent.setId(id);
    }

    @Override
    public String toString() {
        return "Informatikstudent{" +
                "name='" + baseStudent.getName() + '\'' +
                ", id='" + baseStudent.getId() + '\'' +
                '}';
    }
}
