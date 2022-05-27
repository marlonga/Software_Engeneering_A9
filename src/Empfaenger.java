
import java.util.ArrayList;

public class Empfaenger {

    private String Name;
    private ArrayList<Nachricht> alleNachrichten = new ArrayList<>();

    public Empfaenger(String name, Nachrichtendienst nDienst) {
        Name = name;
    }

    /**
     * //@param String
     */

    public void anmelden(Nachrichtendienst nDienst) {
        nDienst.addEmpfaenger(this);
    }

    public void abmelden(Nachrichtendienst nDienst) {
        nDienst.deleteEmpfaenger(this);
    }

    /**
     * //@param Nachricht
     */
    public void recieve(Nachricht n) {
        alleNachrichten.add(n);
    }

    public String getName() {
        return Name;
    }

    @Override
    public String toString() {
        return "Empfaenger{" +
                "Name='" + Name + '\'' +
                ", alleNachrichten=" + alleNachrichten +
                '}';
    }
}

