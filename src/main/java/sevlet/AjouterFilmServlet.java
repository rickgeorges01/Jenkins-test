package sevlet;


import com.ryg.tpjava.SingleInstance.InstanceList;
import com.ryg.tpjava.entity.Film;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(name = "ajoutFilm", value = "/ajouter-film")
//HttpServlet permet d'hériter de toute les classes
public class AjouterFilmServlet extends HttpServlet {

    //Renvoie la page ajouterFilm.jsp
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       req.getRequestDispatcher("WEB-INF/jsp/ajouterFilm.jsp").forward(req,resp);
    }

   // Récupération des données entrées par l'utilisateur suivi d'une redirection avec ses données vers la page liste-film
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String titre = req.getParameter("titre");
        String realisateur = req.getParameter("realisateur");
        String annee = req.getParameter("annee");
        String genre = req.getParameter("genre");

        Film film = new Film(titre,realisateur,annee,genre);
        InstanceList.filmservice.ajouterFilm(film);
        resp.sendRedirect(req.getContextPath()+"/liste-film");
    }
}
