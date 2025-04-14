package org.example;

public class Permessi {
    private int creare;
    private int modificare;
    private int eliminare;
    private int spostare;

    public Permessi(int creare, int modificare, int eliminare, int spostare) {
        this.creare = creare;
        this.modificare = modificare;
        this.eliminare = eliminare;
        this.spostare = spostare;
    }

    // Getter
    public int getCreare() { return creare; }
    public int getModificare() { return modificare; }
    public int getEliminare() { return eliminare; }
    public int getSpostare() { return spostare; }
}
