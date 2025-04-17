package org.example;

public class Utente {
    private String username;
    private Permessi permessi;

    public Utente(String username) {
        this.username = username;
    }

    public void assegnaPermessi(Permessi permessi) {
        this.permessi = permessi;
    }

    public boolean puòCreare() {
        return permessi != null && permessi.puòCreare();
    }

    public boolean puòModificare() {
        return permessi != null && permessi.puòModificare();
    }

    public boolean puòEliminare() {
        return permessi != null && permessi.puòEliminare();
    }

    public boolean puòSpostare() {
        return permessi != null && permessi.puòSpostare();
    }

    public void mostraPermessi() {
    }
}
