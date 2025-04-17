package org.example;

import java.util.ArrayList;
import java.util.List;

public class Bacheca {
    private String titolo;
    private String descrizione;
    private List<ToDo> toDoList = new ArrayList<>();

    public Bacheca(String titolo, String descrizione) {
        this.titolo = titolo;
        this.descrizione = descrizione;
    }

    public void aggiungiToDo(ToDo toDo) {
        toDoList.add(toDo);
    }

    public List<ToDo> getToDoList() {
        return toDoList;
    }
}
