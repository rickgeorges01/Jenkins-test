package com.ryg.tpjava.entity;

public class Livre {
    private String titre;
    private String auteur;
    private String genre;
    private String annee;

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getAuteur() {
        return auteur;
    }

    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getAnnee() {
        return annee;
    }

    public void setAnnee(String annee) {
        this.annee = annee;
    }

    public Livre(String titre, String auteur, String genre, String annee) {
        this.titre = titre;
        this.auteur = auteur;
        this.genre = genre;
        this.annee = annee;
    }
}
