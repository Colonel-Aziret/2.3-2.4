package TaskA;

public class USB {
    private float portType;
    private String id;

    public USB(float portType, String id) {
        this.portType = portType;
        this.id = id;
    }

    @Override
    public String toString() {
        return "USB{" +
                "portType=" + portType +
                ", id='" + id + '\'' +
                '}';
    }
}
