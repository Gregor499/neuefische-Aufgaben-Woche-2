package model;

import java.util.UUID;

public class Student {
    private String name;
    private String id;


public Student(String name){
    this.name = name;
    id = UUID.randomUUID().toString();
}

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String toString(String name, String id) {
        Student student1 = new Student(name);

        return (student1.getName() + ", " +
                student1.getId());
    }


}
