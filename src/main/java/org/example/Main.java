package org.example;

import java.util.ArrayList;
import java.util.Date;

public class Main {
    public static void main(String[] args) {

        Attivita attivita1 = new Attivita("Studio di matematica", "in corso", "www.matematica.com");
        Attivita attivita2 = new Attivita("Progetto di fisica", "in corso", "www.fisica.com");

        Checklist checklist = new Checklist("Checklist compiti");
        checklist.aggiungiAttivita(attivita1);
        checklist.aggiungiAttivita(attivita2);


        ToDo todo1 = new ToDo("Compito di matematica", new Date(), new Date(), "www.compito.com",
                "Fai il compito di matematica", "image1.jpg", "blue", checklist);


        attivita1.setStato("completato");


        todo1.aggiornaCompletamentoDaChecklist();


        System.out.println(todo1);
    }
}
