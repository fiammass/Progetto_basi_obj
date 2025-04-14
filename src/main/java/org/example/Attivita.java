package org.example;

public class Attivita {
     String nome;
     String stato;
     String linkUrl;

    public Attivita(String nome, String stato, String linkUrl) {
        this.nome = nome;
        this.stato = stato;
        this.linkUrl = linkUrl;
    }

    public String toString() {
        String string = "Nome: " + this.nome + " \nstato: " + this.stato + " \nlinkUrl: " + this.linkUrl ;
        return string;
    }
}
