package com.ryg.tpjava.entity;

public class Film {
    private String titre;
    private String realisateur;
    private String genre;
    private String annee;

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getRealisateur() {
        return realisateur;
    }

    public void setRealisateur(String realisateur) {
        this.realisateur = realisateur;
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

    public Film(String titre, String realisateur, String genre, String annee) {
        this.titre = titre;
        this.realisateur = realisateur;
        this.genre = genre;
        this.annee = annee;
    }
}
