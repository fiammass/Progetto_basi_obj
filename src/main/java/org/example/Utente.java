package org.example;

public class Utente {

    private String username;
    private boolean statoUtente;
    private String login;
    private String password;
    private Permessi permessi;

    public Utente(String username, String login, String password, boolean statoUtente) {
        this.username = username;
        this.login = login;
        this.password = password;
        this.statoUtente = statoUtente;
        this.permessi = null; // verrà assegnato dopo
    }

    public void assegnaPermessi(Permessi p) {
        this.permessi = p;
    }

    // Accesso protetto ai permessi
    public boolean puòModificare() {
        return statoUtente && permessi != null && permessi.getModificare() == 1;
    }

    public boolean puòEliminare() {
        return statoUtente && permessi != null && permessi.getEliminare() == 1;
    }

    public boolean puòSpostare() {
        return statoUtente && permessi != null && permessi.getSpostare() == 1;
    }

    public boolean puòCreare() {
        return statoUtente && permessi != null && permessi.getCreare() == 1;
    }

    public void mostraPermessi() {
        if (!statoUtente || permessi == null) {
            System.out.println("Utente non attivo o senza permessi.");
            return;
        }

        System.out.println("Permessi di " + username + ":");
        System.out.println("Creare: " + puòCreare());
        System.out.println("Modificare: " + puòModificare());
        System.out.println("Eliminare: " + puòEliminare());
        System.out.println("Spostare: " + puòSpostare());
    }
}
