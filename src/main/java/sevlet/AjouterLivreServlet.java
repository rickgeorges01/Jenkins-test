package sevlet;

import com.ryg.tpjava.SingleInstance.InstanceList;
import com.ryg.tpjava.entity.Livre;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(name = "ajoutLivre", value = "/ajouter-livre")
public class AjouterLivreServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("WEB-INF/jsp/ajouterLivre.jsp").forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String titre = req.getParameter("titre");
        String auteur = req.getParameter("auteur");
        String annee = req.getParameter("annee");
        String genre = req.getParameter("genre");

        Livre livre = new Livre(titre,auteur,annee,genre);
        InstanceList.livreservice.ajouterLivre(livre);

        resp.sendRedirect(req.getContextPath()+"/liste-livre");
    }
}
