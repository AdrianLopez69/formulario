package servlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

//Es un path o un key para hacer una conexion con el servlet
@WebServlet("/servlet")

public class servlet extends HttpServlet {
    //Indicamos el metodo a utilizatr en el s

    @Override
    protected void doGet (HttpServletRequest peti, HttpServletResponse resp) throws ServletException, IOException {
    //seteo el tipo de contenido que va a devolver
    // el servidor para que devuelva html
    resp.setContentType("text/html");
    //defino una variable de tipo PrintWriter
        //para que se muestre el contenido en pantalla
    PrintWriter out = resp.getWriter();
    out.print("<!DOCTYPE html>");
    out.print("<html>");
    out.print("<head>");
    out.print("<meta charset=\"utf-8\">");
    out.print("<title>Hola mundo</title>");
    out.print("</head>");
    out.print("<body>");
    out.print("<h1>Hola mundo</h1>");
    out.print("</body>");
    out.print("</html>");



    }
}
