import java.util.Date;

public class Nachricht {
    public Nachricht(String text) {
        this.text = text;
        this.absendeDatum = new Date();
    }

    public String getText() {
        return text;
    }

    public Date getAbsendeDatum() {
        return absendeDatum;
    }

    private String text;
    private Date absendeDatum;

    @Override
    public String toString() {
        return "Nachricht{" +
                "text='" + text + '\'' +
                ", absendeDatum=" + absendeDatum +
                '}';
    }
}