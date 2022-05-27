import java.util.ArrayList;

public class Nachrichtendienst {

    private ArrayList<Empfaenger> alleEmpfaenger;

    public Nachrichtendienst() {alleEmpfaenger = new ArrayList<>();}

    /**
     *
     * //@param Empfaenger
     */
    public void addEmpfaenger(Empfaenger e) {
        if ( e != null) {
            alleEmpfaenger.add(e);
        }
    }

    /**
     *
     * //@param Empfaenger
     */
    public void deleteEmpfaenger(Empfaenger e) {
        if (alleEmpfaenger.contains(e)){
            alleEmpfaenger.remove(e);
        }
    }

    /**
     *
     * //@param Nachricht
     * //@param String
     */
    public void manageNachricht(Nachricht n,String e) {
        for(Empfaenger empfaenger : alleEmpfaenger){
            if(empfaenger.getName().equals(e)){
                empfaenger.recieve(n);
            }
        }
    }
    public void manageNachricht(Nachricht n) {
        for (Empfaenger e : alleEmpfaenger){
            e.recieve(n);
        }
    }

    public ArrayList<Empfaenger> getAlleEmpfaenger() {
        return alleEmpfaenger;
    }

    @Override
    public String toString() {
        return "Nachrichtendienst{" +
                "alleEmpfaenger=" + alleEmpfaenger +
                '}';
    }
}