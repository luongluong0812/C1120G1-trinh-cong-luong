import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.nio.charset.IllegalCharsetNameException;

@WebServlet(name = "changeServlet" ,urlPatterns = "/change")
public class changeServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
int rate= Integer.parseInt(request.getParameter("rate"));
int usd= Integer.parseInt(request.getParameter("usd"));
int vnd=rate*usd;
request.setAttribute("result",vnd);
request.getRequestDispatcher("WEB-INF/result.jsp").forward(request,response);
    }
}
