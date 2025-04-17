package org.example;

public class Condivisione {
    private String titolo;
    private String username;
    private boolean statoUtente;

    public Condivisione(String titolo, String username, boolean statoUtente) {
        this.titolo = titolo;
        this.username = username;
        this.statoUtente = statoUtente;
    }

    public String getTitolo() {
        return titolo;
    }

    public String getUsername() {
        return username;
    }

    public boolean isStatoUtente() {
        return statoUtente;
    }
}
