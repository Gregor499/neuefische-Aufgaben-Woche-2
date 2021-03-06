package monday;

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

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                '}';
    }
}
