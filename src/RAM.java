public class RAM {
    private double capacity;
    private String manufacturer;

    public RAM(double capacity, String manufacturer) {
        this.capacity = capacity;
        this.manufacturer = manufacturer;
    }

    @Override
    public String toString() {
        return "RAM{" +
                "capacity=" + capacity +
                ", manufacturer='" + manufacturer + '\'' +
                '}';
    }
}
