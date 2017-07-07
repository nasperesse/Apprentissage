import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.annotation.*;

/**
 * Created by nmodjo on 26.06.2017.
 */
@WebServlet("/Servlet")
public class Servlet extends HttpServlet{


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String benutzername = req.getParameter("bn");
        String passwort = req.getParameter("ps");

        PrintWriter out = resp.getWriter();
        PrintWriter out2 = resp.getWriter();

        if(passwort.equals("emmanuel")) {

            out.println("<HTML>");
            out.println("<HEAD><TITLE>Anmgemeldet</TITLE></HEAD>");
            out.println("<BODY>");
            out.println("<H1>willkommen Herr " + benutzername + " </H1>");
            out.println("<p>Was wollen sie heute machen</p>");
            out.println("</BODY>");
            out.println("</HTML>");
          out.flush();
        }

        else{

            out2.println("<HTML>");
            out2.println("<HEAD><TITLE>falscher User</TITLE></HEAD>");
            out2.println("<BODY>");
            out2.println("<H1>Geben Sie bitte das richtige Passwort ein</H1>");
            out2.println("<p><a>wollen sie nochmal versuchen?</a></p>");
            out2.println("</BODY>");
            out2.println("</HTML>");
            out2.flush();


        }




    }
}
