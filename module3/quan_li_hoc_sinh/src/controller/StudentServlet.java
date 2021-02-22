package controller;

import repository.InterfaceStudentRepository;
import service.InterfaceStudentService;
import service.StudentService;

import javax.lang.model.element.PackageElement;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.SQLException;

@WebServlet(name = "StudentServlet",urlPatterns = {"","/student"})
public class StudentServlet extends HttpServlet {
    private InterfaceStudentService studentService= (InterfaceStudentService) new StudentService();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action=request.getParameter("action");
        if(action==null){
            action="";
        }

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action=request.getParameter("action");
        if(action==null){
            action="";
        }
        if(action.equals("")){
            loadList(request, response);
        }

    }

    private void loadList(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            request.setAttribute("list_student",studentService.findAllStudent());
            request.getRequestDispatcher("/student/list.jsp").forward(request,response);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
