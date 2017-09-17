package Utils;

/**
 * Created by Andre on 17.09.2017.
 */
public class Letter {
    String whom;
    String subject;
    String text;

    public Letter(String whom, String subject, String text) {
        this.whom = whom;
        this.subject = subject;
        this.text = text;
    }

    public String getWhom() {
        return whom;
    }

    public void setWhom(String whom) {
        this.whom = whom;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return "Letter{" +
                "whom='" + whom + '\'' +
                ", subject='" + subject + '\'' +
                ", text='" + text + '\'' +
                '}';
    }
}
