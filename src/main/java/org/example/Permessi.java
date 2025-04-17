package org.example;

public class Permessi {
    private boolean creare;
    private boolean modificare;
    private boolean eliminare;
    private boolean spostare;

    public Permessi(boolean creare, boolean modificare, boolean eliminare, boolean spostare) {
        this.creare = creare;
        this.modificare = modificare;
        this.eliminare = eliminare;
        this.spostare = spostare;
    }

    public boolean puòCreare() {
        return creare;
    }

    public boolean puòModificare() {
        return modificare;
    }

    public boolean puòEliminare() {
        return eliminare;
    }

    public boolean puòSpostare() {
        return spostare;
    }
}
