package TaskA;

public class User {
    private String FIO; // ФИО
    private String login;
    private int age;
    private String password;
    private boolean isTheAccountBlocked;

    public User(String FIO, String login, int age, String password, boolean isTheAccountBlocked) {
        this.FIO = FIO;
        this.login = login;
        this.age = age;
        this.password = password;
        this.isTheAccountBlocked = isTheAccountBlocked;
        if (age <=0 ) {
            System.out.println("Вы ввели неверный возраст");
        }
    }
    public User() {
        FIO = "Ramankulov Aziret Nurbekovich";
        login = "Admin";
        age = 19;
        password = "12345";
        isTheAccountBlocked = false;
    }

    public String getFIO() {
        return FIO;
    }

    public void setFIO(String FIO) {
        this.FIO = FIO;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isTheAccountBlocked() {
        return isTheAccountBlocked;
    }

    public void setTheAccountBlocked(boolean theAccountBlocked) {
        isTheAccountBlocked = theAccountBlocked;
    }

    @Override
    public String toString() {
        return "User{" +
                "FIO='" + FIO + '\'' +
                ", login='" + login + '\'' +
                ", age=" + age +
                ", password='" + password + '\'' +
                ", isTheAccountBlocked=" + isTheAccountBlocked +
                '}';
    }
}
