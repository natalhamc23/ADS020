
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author 19214290010
 */
@WebServlet(name = "CicloVidaServlet", urlPatterns = "/CicloVidaServlet")

public class CicloVidaServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        System.out.println("Executando CicloVidaServlet");
    }

    @Override
    public void init() throws ServletException {

        System.out.println("Iniciando CicloVidaServlet.init()");
    }

    @Override
    public void destroy() {

        System.out.println("Finalizando CicloVidaServlet.detroy ()");

    }

}
