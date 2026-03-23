package ex6;

public class Category {
    private String id;
    private String name;
    private String description;

    public Category() {}

    public Category(String id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }

    public String getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "ID: " + id +
                ", Name: " + name +
                ", Description: " + description;
    }
}
