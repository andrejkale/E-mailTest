package Utils;

import java.util.ResourceBundle;

/**
 * Created by Andre on 17.09.2017.
 */
public class LetterFactory {
    static ResourceBundle resource;

    static {
        resource = ResourceBundle.getBundle("letter");
    }
    public static Letter writeNewLetter(){
        return new Letter(resource.getString("whom"),resource.getString("subject"), resource.getString("text"));
    }
}
