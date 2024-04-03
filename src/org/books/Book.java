package org.books;

public class Book {
    private String titolo;
    private int numeroPagine;
    private String autore;
    private String editore;

    public Book(String titolo, int numeroPagine, String autore, String editore) throws IllegalArgumentException {
        //isEmpty = ritorna true se length == 0
        if ((titolo == null || titolo.isEmpty() || autore == null || autore.isEmpty() || editore == null || editore.isEmpty()) && numeroPagine <= 0) {
            throw new IllegalArgumentException("Fields cannot be empty or negative");
        } else if (titolo == null || titolo.isEmpty() || autore == null || autore.isEmpty() || editore == null || editore.isEmpty()) {
            throw new IllegalArgumentException("The title, author or publisher cannot be blank");
        } else if (numeroPagine <= 0) {
            throw new IllegalArgumentException("Page numbers cannot be less than or equal to 0");
        }
        this.titolo = titolo;
        this.numeroPagine = numeroPagine;
        this.autore = autore;
        this.editore = editore;
    }

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) throws IllegalArgumentException {
        if (titolo == null || titolo.isEmpty()) {
            throw new IllegalArgumentException("The title cannot be blank");
        }
        this.titolo = titolo;
    }

    public int getNumeroPagine() {
        return numeroPagine;
    }

    public void setNumeroPagine(int numeroPagine) throws IllegalArgumentException {
        if (numeroPagine <= 0) {
            throw new IllegalArgumentException("Page numbers cannot be less than or equal to 0");
        }
        this.numeroPagine = numeroPagine;
    }

    public String getAutore() {
        return autore;
    }

    public void setAutore(String autore) throws IllegalArgumentException {
        if (autore == null || autore.isEmpty()) {
            throw new IllegalArgumentException("The author cannot be blank");
        }
        this.autore = autore;
    }

    public String getEditore() {
        return editore;
    }

    public void setEditore(String editore) throws IllegalArgumentException {
        if (editore == null || editore.isEmpty()) {
            throw new IllegalArgumentException("The publisher cannot be blank");
        }
        this.editore = editore;
    }

    public String getFullInfoBook() {
        return "BOOK INFORMATION\n" + "Title: " + getTitolo() + '\n' + "Number page: " + getNumeroPagine() + '\n' + "Author: " + getAutore() + '\n' + "Publisher: " + getEditore();
    }
}
