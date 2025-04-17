package org.example;

import java.util.ArrayList;
import java.util.List;

public class Checklist {
    private String nome;
    private List<Attivita> attivitaList = new ArrayList<>();

    public Checklist(String nome) {
        this.nome = nome;
    }

    public void aggiungiAttivita(Attivita attivita) {
        attivitaList.add(attivita);
    }

    public List<Attivita> getAttivitaList() {
        return attivitaList;
    }
}
