package sevlet;


import com.ryg.tpjava.SingleInstance.InstanceList;
import com.ryg.tpjava.entity.Film;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.ArrayList;

@WebServlet(name = "listFilm", value = "/liste-film")
public class ListeFilmSevlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ArrayList<Film> listFilms = InstanceList.filmservice.getListFilm();
        //envoie des Films récupérer
        req.setAttribute("listFilms", listFilms);
        req.getRequestDispatcher("WEB-INF/jsp/listeFilm.jsp").forward(req,resp);
    }
}
