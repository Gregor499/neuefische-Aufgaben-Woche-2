package tuesday.heritage;

import java.util.UUID;

public abstract class Student {
    private String name;
    private String id;

    public Student(String name) {
        this.name = name;
        id = UUID.randomUUID().toString();
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public String getSubject() {
        return "Informatik";
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Informatikstudent{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                '}';
    }
}