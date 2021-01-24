import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "SumServlet",urlPatterns ="/sum2Number" )
public class SumServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int a=Integer.parseInt(request.getParameter("number1"));
        int b=Integer.parseInt(request.getParameter("number2"));
        int total=a+b;

        PrintWriter writer = response.getWriter();
        writer.println("<html>");
        writer.println("<h> abc </h>");
        writer.println("</html>");

    }
}
