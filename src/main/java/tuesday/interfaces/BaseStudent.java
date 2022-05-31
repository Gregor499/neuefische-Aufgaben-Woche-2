package tuesday.interfaces;

import java.util.UUID;

class BaseStudent {
    private String name;
    private String id = UUID.randomUUID().toString();

    public BaseStudent(String name) {
        this.name = name;
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
}
