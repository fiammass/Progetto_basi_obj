package org.example;

public class StatoAttivita {
    private boolean completato;


    public StatoAttivita(boolean completato) {
        this.completato = completato;
    }


    public boolean isCompletato() {
        return completato;
    }


    public void setCompletato(boolean completato) {
        this.completato = completato;
    }

    @Override
    public String toString() {
        return "Stato Attività: " + (completato ? "Completato" : "Non Completato");
    }
}
