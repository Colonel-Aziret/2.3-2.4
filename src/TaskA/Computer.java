package TaskA;

public class Computer {
    private User user = new User("Ramankulov Aziret Nurbekovich", "Admin", 19, "12345", false);
    private Display display = new Display(14.2, "CHINA", "Liquid Retina XDR");
    private String stamp = "MacBook Pro 16";
    private String color = "Space grey";
    private HardDrive hardDrive = new HardDrive(4, 2);
    private RAM ram = new RAM(64, "Thailand");
    private String videoCore = "Apple graphics 8-core";
    private USB usb = new USB(3.0f, "123.456.789.000");
    private Keyboard keyboard = new Keyboard(true, false);

    @Override
    public String toString() {
        return "Computer{" +
                "user=" + user +
                "\n, display=" + display +
                "\n, stamp='" + stamp + '\'' +
                "\n, color='" + color + '\'' +
                "\n, hardDrive=" + hardDrive +
                "\n, ram=" + ram +
                "\n, videoCore='" + videoCore + '\'' +
                "\n, usb=" + usb +
                "\n, keyboard=" + keyboard +
                '}';
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
