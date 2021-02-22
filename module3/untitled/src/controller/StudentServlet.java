package controller;

import bean.Student;
import service.IStudentService;
import service.Iplm.StudentService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.PreparedStatement;
import java.util.List;

@WebServlet(name = "StudentServlet", urlPatterns = {"", "/student"})
public class StudentServlet extends HttpServlet {
    private IStudentService studentService = new StudentService();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "edit":
                Student student=new Student();
                student.setId(Integer.parseInt(request.getParameter("id")));
                student.setAge(Integer.parseInt(request.getParameter("age")));
                student.setName(request.getParameter("name"));
                student.setAddress(request.getParameter("address"));
                studentService.save(student);
                loadList(request,response);
                break;
            case "add1":int id=Integer.parseInt(request.getParameter("id"));
            int age=Integer.parseInt(request.getParameter("age"));
            String name=request.getParameter("name");
            String address=request.getParameter("address");
            Student student1=new Student(id,age,name,address);
            studentService.add(student1);
            loadList(request,response);
            break;





        }

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "edit":
                Integer id = Integer.parseInt(request.getParameter("id"));
                Student student3 = studentService.findById(id);
                request.setAttribute("studentInfo", student3);
                request.getRequestDispatcher("/student/update.jsp").forward(request, response);
                break;
            case "delete":
                Integer idDelete = Integer.parseInt(request.getParameter("id"));
                Student student1=studentService.findById(idDelete);
                request.setAttribute("student",student1);
                request.getRequestDispatcher("/student/delete.jsp").forward(request,response);
                break;
            case "yes":
                Integer idOk=Integer.parseInt(request.getParameter("id"));
                studentService.deleteById(idOk);
                loadList(request,response);
                break;
            case"add1": request.getRequestDispatcher("/student/create.jsp").forward(request,response);
                break;
            case "no":
                loadList(request,response);
                break;

            default:
                loadList(request, response);
                break;
        }
    }

    public void loadList(HttpServletRequest request, HttpServletResponse response) {
        request.setAttribute("listStudent", studentService.findAll());
        try {
            request.getRequestDispatcher("/student/students.jsp").forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
