package org.example;

public class Attivita {
    private String nome;
    private String stato;
    private String linkUrl;
    private boolean completata;  // Campo che rappresenta lo stato di completamento


    public Attivita(String nome, String stato, String linkUrl) {
        this.nome = nome;
        this.stato = stato;
        this.linkUrl = linkUrl;
        this.completata = false;  // Imposta inizialmente lo stato a "non completata"
    }


    public boolean isCompletata() {
        return completata;
    }


    public void setCompletata(boolean completata) {
        this.completata = completata;
    }


    public void setStato(String stato) {
        this.stato = stato;
        if ("completato".equalsIgnoreCase(stato)) {
            this.completata = true;
        } else {
            this.completata = false;
        }
    }


    @Override
    public String toString() {
        return "Nome: " + this.nome + " \nStato: " + this.stato + " \nLink URL: " + this.linkUrl;
    }
}
