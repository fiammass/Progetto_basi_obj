package model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ToDo {
    private String titolo;
    private Date dataCreazione;
    private Date dataScadenza;
    private String descrizione;
    private Stato stato;
    private List<Attivita> attivitaList;
    private List<Utente> condivisoCon;

    public ToDo(String titolo, Date dataScadenza) {
        this.titolo = titolo;
        this.dataCreazione = new Date();
        this.dataScadenza = dataScadenza;
        this.stato = Stato.NON_COMPLETATO;
        this.attivitaList = new ArrayList<>();
        this.condivisoCon = new ArrayList<>();
        aggiornaStato();
    }

    public void aggiungiAttivita(String nomeAttivita) {
        attivitaList.add(new Attivita(nomeAttivita));
        aggiornaStato();
    }

    public void completaAttivita(String nomeAttivita) {
        attivitaList.stream()
                .filter(a -> a.getNome().equals(nomeAttivita))
                .findFirst()
                .ifPresent(Attivita::completa);
        aggiornaStato();
    }

    public void condividiCon(Utente utente) {
        if (!condivisoCon.contains(utente)) {
            condivisoCon.add(utente);
            utente.aggiungiTodoCondiviso(this);
        }
    }

    private void aggiornaStato() {
        Date oggi = new Date();
        if (dataScadenza.before(oggi)) {
            stato = Stato.SCADUTO;
        } else if (attivitaList.isEmpty()) {
            stato = Stato.NON_COMPLETATO;
        } else if (attivitaList.stream().allMatch(a -> a.getStato() == Stato.COMPLETATO)) {
            stato = Stato.COMPLETATO;
        } else if (attivitaList.stream().anyMatch(a -> a.getStato() == Stato.COMPLETATO)) {
            stato = Stato.IN_CORSO;
        }
    }

    public String getTitolo() {
        return titolo;
    }

    public Stato getStato() {
        return stato;
    }

    @Override
    public String toString() {
        return titolo + " (" + stato.getDescrizione() + ") - Scadenza: " + dataScadenza;
    }

    public Date getDataCreazione() {
        return dataCreazione;
    }

    public Date getDataScadenza() {
        return dataScadenza;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public List<Attivita> getAttivitaList() {
        return attivitaList;
    }

    public void mostraAttivita() {
        if (attivitaList.isEmpty()) {
            System.out.println("Nessuna attività presente");
        } else {
            System.out.println("Attività per '" + titolo + "':");
            for (int i = 0; i < attivitaList.size(); i++) {
                System.out.println((i+1) + ". " + attivitaList.get(i));
            }
        }
    }
}
