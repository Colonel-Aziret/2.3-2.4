public class HardDrive {
    private double memorySize;
    private int diskDivided;

    public HardDrive(double memorySize, int diskDivided) {
        this.memorySize = memorySize;
        this.diskDivided = diskDivided;
    }

    @Override
    public String toString() {
        return "HardDrive{" +
                "memorySize=" + memorySize +
                ", diskDivided=" + diskDivided +
                '}';
    }
}
