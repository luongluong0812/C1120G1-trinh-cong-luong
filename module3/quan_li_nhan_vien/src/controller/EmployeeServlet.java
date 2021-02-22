package controller;

import bean.Employee;
import service.EmployeeService;
import service.IEmployeeService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "EmployeeServlet",urlPatterns = {"","/employee"})
public class EmployeeServlet extends HttpServlet {
    private IEmployeeService employeeService=new EmployeeService();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action=request.getParameter("action");
        if (action==null){
            action="";
        } switch (action){
            case "edit": int id= Integer.parseInt(request.getParameter("id"));
            request.setAttribute("employeeEdit",employeeService.findById(id));
            request.getRequestDispatcher("/employee/edit.jsp").forward(request,response);
            break;
            case "update":
                Employee employee1=null;
                int id1= Integer.parseInt(request.getParameter("id"));
                String name1=request.getParameter("name");
                String email1=request.getParameter("email");
                String address1=request.getParameter("address");
                employee1=new Employee(id1,name1,email1,address1);
                employeeService.update(employee1);



            default:
                request.setAttribute("allEmployee",employeeService.findAllEmployee());
                request.getRequestDispatcher("/employee/listEmployee.jsp").forward(request,response);
            break;
        }

    }
}
