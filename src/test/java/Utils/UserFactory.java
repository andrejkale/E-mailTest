package Utils;

import java.util.ResourceBundle;

/**
 * Created by Andre on 16.09.2017.
 */
public class UserFactory {
    static ResourceBundle resource;
     static {
        resource = ResourceBundle.getBundle("user");
    }


    public static User getValidUser(){
      return   new User(resource.getString("valid.name"), resource.getString("valid.password"));
    }
    public static User getInValidUser(){
        return   new User(resource.getString("invalid.name"), resource.getString("invalid.password"));
    }
}
