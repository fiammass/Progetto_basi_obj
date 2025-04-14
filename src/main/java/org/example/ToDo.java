package org.example;

import java.util.Date;

public class ToDo {
    private String titolo;
    private Date dataInizio;
    private Date dataScadenza;
    private String linkUrl;
    private String descrizione;
    private String immagine;
    private String coloreSfondo;
    private Checklist checklist;

    public ToDo(String titolo, Date dataInizio, Date dataScadenza, String linkUrl,
                String descrizione, String immagine, String coloreSfondo) {
        this.titolo = titolo;
        this.dataInizio = dataInizio;
        this.dataScadenza = dataScadenza;
        this.linkUrl = linkUrl;
        this.descrizione = descrizione;
        this.immagine = immagine;
        this.coloreSfondo = coloreSfondo;
    }

    public void setChecklist(Checklist checklist) {
        this.checklist = checklist;
    }
    public String getDescrizione() {
        return descrizione;
    }

}
