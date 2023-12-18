package sevlet;

import com.ryg.tpjava.SingleInstance.InstanceList;
import com.ryg.tpjava.entity.Livre;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.ArrayList;

@WebServlet(name = "ajoutLivre", value = "/liste-livre")
public class ListeLivreServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ArrayList<Livre> listLivres = InstanceList.livreservice.getListLivre();
        //envoie les livres récuperer dans listeLivre.jsp
        req.setAttribute("listLivres", listLivres);
        req.getRequestDispatcher("WEB-INF/jsp/listeLivre.jsp").forward(req, resp);
    }
}
