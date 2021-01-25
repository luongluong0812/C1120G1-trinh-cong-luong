import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

@WebServlet(name = "checkServlet",urlPatterns = "/check")
public class checkServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Map<String,String> map=new HashMap();
        map.put("hello","chao ban");
        map.put("one","so 1");
        map.put("two","so 2");
        String search= request.getParameter("word");
        String result=map.get(search);
        if(result!=null){
            request.setAttribute("result",result);
            request.getRequestDispatcher("WEB-INF/result.jsp").forward(request,response);
        } else {
            request.setAttribute("result","not fount!");
            request.getRequestDispatcher("WEB-INF/result.jsp").forward(request,response);
        }

    }
}
