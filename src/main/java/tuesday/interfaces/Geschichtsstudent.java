package tuesday.interfaces;

import java.util.Collection;
import java.util.List;
import java.util.UUID;

public class Geschichtsstudent implements Student {

    private final BaseStudent baseStudent;

    public Geschichtsstudent(String name) {
        baseStudent = new BaseStudent(name);
    }

    public String getName() {
        return baseStudent.getName();
    }

    public String getId() {
        return baseStudent.getId();
    }

    public String getSubject() {
        return "Geschichte";
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
