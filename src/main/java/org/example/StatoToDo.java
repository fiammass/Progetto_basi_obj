package org.example;

public class StatoToDo {
    private boolean completato;
    private boolean nonCompletato;

    public StatoToDo(boolean completato, boolean nonCompletato) {
        this.completato = completato;
        this.nonCompletato = nonCompletato;
    }

    public boolean isCompletato() {
        return completato;
    }

    public void setCompletato(boolean completato) {
        this.completato = completato;
    }

    public boolean isNonCompletato() {
        return nonCompletato;
    }

    public void setNonCompletato(boolean nonCompletato) {
        this.nonCompletato = nonCompletato;
    }
}
