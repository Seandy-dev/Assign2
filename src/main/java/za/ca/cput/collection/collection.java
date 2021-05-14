package za.ca.cput.collection;

public class collection {
    private String clothes;

    public collection(String clothes) {
        this.clothes = clothes;
    }

    public String getClothes() {
        return clothes;
    }

    public void setClothes(String clothes) {
        this.clothes = clothes;
    }

    @Override
    public String toString() {
        return "collection{" +
                "clothes='" + clothes + '\'' +
                '}';
    }
}
