package com.ryg.tpjava.services;

import com.ryg.tpjava.entity.Livre;

import java.util.ArrayList;

public class LivreService {
    private ArrayList <Livre> listLivre;

    public LivreService() {
       listLivre = new ArrayList<>();
    }
    public void ajouterLivre(Livre livre){
        listLivre.add(livre);
    }

    public ArrayList<Livre> getListLivre() {
        return listLivre;
    }
}
