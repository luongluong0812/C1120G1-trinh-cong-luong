import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "CalculatorServlet",urlPatterns = "/calculator")
public class CalculatorServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
Double price=Double.parseDouble(request.getParameter("price"));
Double discount=Double.parseDouble(request.getParameter("discount"));
String Description= request.getParameter("info");

       Double result=price*discount*0.1;
       Double res=price*discount-result;
        PrintWriter printWriter=response.getWriter();
        printWriter.print("<html>");
        printWriter.print("<body>");
        printWriter.print("<h>"+"Description: "+Description+"</h>");
        printWriter.print("<br>");
        printWriter.print("<h>"+"Discount Amount: "+result+"</h>");
        printWriter.print("<br>");
        printWriter.print("<h>"+"Discount Amount: "+res+"</h>");

        printWriter.print("</body>");
        printWriter.print("</html>");




    }
}
