package org.example;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ToDo {
    private String titolo;
    private Date dataInizio;
    private Date dataScadenza;
    private String linkUrl;
    private String descrizione;
    private String immagine;
    private String coloreSfondo;
    private boolean completato = false;
    private Checklist checklist;
    private List<Utente> utentiCondivisi;


    public ToDo(String titolo, Date dataInizio, Date dataScadenza, String linkUrl,
                String descrizione, String immagine, String coloreSfondo, Checklist checklist) {
        this.titolo = titolo;
        this.dataInizio = dataInizio;
        this.dataScadenza = dataScadenza;
        this.linkUrl = linkUrl;
        this.descrizione = descrizione;
        this.immagine = immagine;
        this.coloreSfondo = coloreSfondo;
        this.checklist = checklist;
        this.utentiCondivisi = new ArrayList<>();
    }




    public void aggiornaCompletamentoDaChecklist() {
        if (checklist != null && !checklist.getAttivitaList().isEmpty()) {
            boolean tutteCompletate = checklist.getAttivitaList().stream()
                    .allMatch(Attivita::isCompletata);  // Verifica se tutte le attività sono completate
            this.completato = tutteCompletate;
        }
    }


    @Override
    public String toString() {
        return "ToDo: " + titolo +
                "\nScadenza: " + dataScadenza +
                "\nCompletato: " + completato +
                "\nCondiviso con: " + utentiCondivisi.size() + " utenti";
    }
}
