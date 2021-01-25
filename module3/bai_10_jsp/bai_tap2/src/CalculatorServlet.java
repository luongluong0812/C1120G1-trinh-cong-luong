import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "CalculatorServlet",urlPatterns = "/calculator")
public class CalculatorServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        Double a=Double.parseDouble(request.getParameter("number1"));
        Double b=Double.parseDouble(request.getParameter("number2"));
        String operator=request.getParameter("operator");
        Double result=0.0;
        if("+".equals(operator)){
            result=a+b;
            request.setAttribute("result",result);
            request.getRequestDispatcher("kq.jsp").forward(request,response);
        }
        if("-".equals(operator)){
            result=a-b;
            request.setAttribute("result",result);
            request.getRequestDispatcher("kq.jsp").forward(request,response);
        }
        if("*".equals(operator)){
            result=a*b;
            request.setAttribute("result",result);
            request.getRequestDispatcher("kq.jsp").forward(request,response);
        }
        if("/".equals(operator)){
            result=a/b;
            request.setAttribute("result",result);
            request.getRequestDispatcher("kq.jsp").forward(request,response);
        }

    }
}
