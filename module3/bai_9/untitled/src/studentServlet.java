import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "studentServlet",urlPatterns = "")
public class studentServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Student> list=new ArrayList<>();
        list.add(new Student(1,"luong","hue",12,0));
        list.add(new Student(2,"an","hue",20,1));
        list.add(new Student(3,"binh","hue",13,1));
        list.add(new Student(4,"long","hue",10,0));
        request.setAttribute("listStudent",list);
        request.getRequestDispatcher("index.jsp").forward(request,response);

    }
}
