import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "CustomerServlet" ,urlPatterns = {"","/list"})
public class CustomerServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Customer> list=new ArrayList<>();
        list.add(new Customer(1,"luong",22,"08-12","hue",1));
        list.add(new Customer(2,"anh",23,"09-12","da nang",0));
        list.add(new Customer(3,"binh",24,"10-12","quang nam",0));
        list.add(new Customer(4,"an",25,"03-02","hue",1));
        request.setAttribute("listCustomer",list);
        request.getRequestDispatcher("list.jsp").forward(request,response);
    }
}
