package com.ryg.tpjava.SingleInstance;

import com.ryg.tpjava.services.FilmService;
import com.ryg.tpjava.services.LivreService;

public class InstanceList {
    public static final FilmService filmservice = new FilmService();
    public static final LivreService livreservice = new LivreService();
}
