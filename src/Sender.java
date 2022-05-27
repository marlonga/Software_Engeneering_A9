public class Sender {

    private Nachrichtendienst nDienst;

    public Sender(Nachrichtendienst nDienst) {
        this.nDienst = nDienst;
    }

    /**
     *
     * //@param Nachricht
     */
    public void send(Nachricht n) {
        nDienst.manageNachricht(n);
    }

    /**
     *
     * //@param Nachricht
     * //@param String
     */
    public void send(Nachricht n, String e) {
        nDienst.manageNachricht(n,e);
    }

    /**
     *
     * //@param String
     */
    public Nachricht createNachricht(String text) {
        return new Nachricht(text);
    }

    @Override
    public String toString() {
        return "Sender{" +
                "nDienst=" + nDienst + '}';
    }
}