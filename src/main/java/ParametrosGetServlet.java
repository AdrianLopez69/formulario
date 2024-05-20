import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/servletParametros")
public class ParametrosGetServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        resp.setContentType("text/html");

        // Recuperamos los parametros
        String nom = req.getParameter("nombre");
        String ape = req.getParameter("apellido");
       int ed = Integer.parseInt(req.getParameter("edad"));
        String cur = req.getParameter("curso");
        String gen = req.getParameter("genero");
        String prog = req.getParameter("programas");
        String desc = req.getParameter("descripcion");

        //imprimimos los parametros
        PrintWriter out = resp.getWriter();

        out.println("<html>");
        out.println("<head><title>Resultados del Formulario</title>");
        // Incluimos la libreria de bootstrap
        out.println("<link href='https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css' rel='stylesheet'>");
       out.print(" <style>");
        out.print(" body {");
        out.print(" background-color: green;");
        out.print(" }");
        out.print(".card { ");
        out.print("background-color: white; ")    ;
        out.print(" padding: 20px;")   ;
        out.print("border-radius: 10px; ") ;
        out.print("} ");
        out.print("</style> ");
        out.println("</head>");
        out.println("<body>");
        out.println("<div class='container mt-5'>");
        out.println("<h2 class='text-center' style='color:white'>Información Recibida del Formulario</h2>");
        out.println("<div class='card'><div class='card-body'>");
        out.println("<p><strong>Nombre:</strong> " + nom + "</p>");
        out.println("<p><strong>Apellido:</strong> " + ape + "</p>");
        out.println("<p><strong>Edad:</strong> " + ed + "</p>");
        out.println("<p><strong>Curso:</strong> " + cur+ "</p>");
        out.println("<p><strong>Género:</strong> " + gen + "</p>");
        out.println("<p><strong>Programas de Conocidos:</strong> " + prog+ "</p>");
        out.println("<p><strong>Descripción:</strong> " + desc + "</p>");
        out.println("<button class='btn btn-secondary'><a href='index.html' style='color:white'>Regresar</a></button>");
        out.println("</div></div>");
        out.println("</div>");

        // Incluimos la libreria dboostrap js
        out.println("<script src='https://code.jquery.com/jquery-3.5.1.slim.min.js'></script>");
        out.println("<script src='https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js'></script>");
        out.println("</body>");
        out.println("</html>");


    }



}
