package Utils;

/**
 * Created by Andre on 16.09.2017.
 */
public class User {
    String name;
    String password;

    public User(String name, String pasword) {
        this.name = name;
        this.password = pasword;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPasword(String pasword) {
        this.password = pasword;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", pasword='" + password + '\'' +
                '}';
    }
}
