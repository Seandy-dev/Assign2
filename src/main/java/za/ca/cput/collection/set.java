package za.ca.cput.collection;

public class set{
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "set{" +
                "name='" + name + '\'' +
                '}';
    }
}
