package collection;

public class Employee {
    private String name;
    private int id;
    private String UUID;

    public Employee(String name, int id, String UUID) {
        this.name = name;
        this.id = id;
        this.UUID = UUID;
    }

    public Employee() {
    }

    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUUID() {
        return UUID;
    }

    public void setUUID(String UUID) {
     this.UUID = UUID;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", UUID='" + UUID + '\'' +
                '}';
    }
}
