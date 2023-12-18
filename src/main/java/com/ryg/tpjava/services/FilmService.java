package com.ryg.tpjava.services;

import com.ryg.tpjava.entity.Film;

import java.util.ArrayList;

public class FilmService {
    private ArrayList<Film> listFilm;

    public FilmService() {
        listFilm = new ArrayList<>();
    }

    public void ajouterFilm(Film Film){
        listFilm.add(Film);
    }

    public ArrayList<Film> getListFilm() {
        return listFilm;
    }
}
