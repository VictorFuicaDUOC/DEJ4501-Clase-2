/*
 * La clase Servlet es la clase que los desarrolladores de JavaWeb 
 * crearon para permitir a los programadores acceder a los elementos
 * del web en forma simple.
 * ¿Cómo? Tu heredas de servlet y puedes acceder a la solicitud
 * (request) y a la respuesta (response) y además a la configuración
 * del servidor, las cookies y las sesiones.
 */
package web;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import negocio.Saludador;
/**
 *
 * @author cetecom
 */
@WebServlet(name = "HolaMundoServlet", urlPatterns = {"/HolaMundoServlet"})
public class HolaMundoServlet extends HttpServlet {
    /* El metodo doGet es el que se ejecuta cuando el usuario accede a la url asociada a este servlet */
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse response) throws ServletException, IOException {
        // le decimos al la respuesta que vamos a mandar HTML
        response.setContentType("text/html");
        // obtengo un objeto para la respuesta...
        PrintWriter out = response.getWriter();
        String saludo = Saludador.elegirSaludo();
        out.println(saludo + ", desde Java!");
    }


}
