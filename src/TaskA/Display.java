package TaskA;

public class Display {
    private double diagonal;
    private String manufacturer;
    private String matrixType;

    public Display(double diagonal, String manufacturer, String matrixType) {
        this.diagonal = diagonal;
        this.manufacturer = manufacturer;
        this.matrixType = matrixType;
    }

    public Display() {
        diagonal = 14.2;
        manufacturer = "CHINA";
        matrixType = "Liquid Retina XDR";
    }

    @Override
    public String toString() {
        return "Display{" +
                "diagonal=" + diagonal +
                ", manufacturer='" + manufacturer + '\'' +
                ", matrixType='" + matrixType + '\'' +
                '}';
    }
}
