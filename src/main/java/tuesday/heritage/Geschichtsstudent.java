package tuesday.heritage;

import java.util.UUID;

public class Geschichtsstudent extends Student {
    private String name;
    private String id;

    public Geschichtsstudent(String name) {
        super(name);
        id = UUID.randomUUID().toString();
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public String getSubject() {
        return "Geschichte";
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
