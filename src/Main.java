public class Main {

    public static void main(String[] args) {

        Nachrichtendienst nachrichtendienst = new Nachrichtendienst();
        Empfaenger empfaenger1 = new Empfaenger("guest1", nachrichtendienst);
        Empfaenger empfaenger2 = new Empfaenger("guest2", nachrichtendienst);
        Empfaenger empfaenger3 = new Empfaenger("guest3", nachrichtendienst);
        empfaenger1.anmelden(nachrichtendienst);
        empfaenger1.anmelden(nachrichtendienst);
        empfaenger1.anmelden(nachrichtendienst);

        Sender sender = new Sender(nachrichtendienst);
        Sender sender1 = new Sender(nachrichtendienst);
        sender.send(new Nachricht("Hello an alle"));
        sender.send(new Nachricht("Hello Guest 1"), "guest1");
        sender1.send(new Nachricht("Hello an alle1"));
        empfaenger1.abmelden(nachrichtendienst);
        empfaenger2.abmelden(nachrichtendienst);
        empfaenger3.abmelden(nachrichtendienst);

        System.out.println();
    }
}

