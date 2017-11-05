package Utils;

/**
 * Created by Andre on 30.09.2017.
 */
public class Email  {
    String fromEmail;
    String subjectEmail;
    String dateEmail;

    public Email(String fromEmail, String subjectEmail, String dateEmail) {
        this.fromEmail = fromEmail;
        this.subjectEmail = subjectEmail;
        this.dateEmail = dateEmail;
    }

    @Override
    public String toString() {
        return "Email{" +
                "fromEmail='" + fromEmail + '\'' +
                ", subjectEmail='" + subjectEmail + '\'' +
                ", dateEmail='" + dateEmail + '\'' +
                '}';
    }
}
