package Helpers;

import Pages.NewLetter;
import Utils.Letter;
import Utils.LetterFactory;

/**
 * Created by Andre on 17.09.2017.
 */
public class NewLetterHelper extends NewLetter {
    public void sendMail(Letter letter){

        sendMail(letter.getWhom(), letter.getSubject(), letter.getText());


    }
    public void sendNewMail(){
        Letter letter = LetterFactory.writeNewLetter();
        sendMail(letter.getWhom(),letter.getSubject(), letter.getText());
    }
}
