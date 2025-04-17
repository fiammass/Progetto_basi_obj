package org.example;

public class TitoloBacheca {
    private String universita;
    private String lavoro;
    private String tempoLibero;

    public TitoloBacheca(String università, String lavoro, String tempoLibero) {
        this.universita = università;
        this.lavoro = lavoro;
        this.tempoLibero = tempoLibero;
    }

    public String getUniversita() {
        return universita;
    }

    public void setUniversità(String università) {
        this.universita = università;
    }

    public String getLavoro() {
        return lavoro;
    }

    public void setLavoro(String lavoro) {
        this.lavoro = lavoro;
    }

    public String getTempoLibero() {
        return tempoLibero;
    }

    public void setTempoLibero(String tempoLibero) {
        this.tempoLibero = tempoLibero;
    }
}
