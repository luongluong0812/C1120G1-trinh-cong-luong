package controller;

import bean.Customer;
import service.CustomerService;
import service.ICustomerService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

@WebServlet(name = "CustomerServlet",urlPatterns = {"","/customer"})
public class CustomerServlet extends HttpServlet {
    private ICustomerService customerService=new CustomerService();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
String action=request.getParameter("action");
if(action==null){
    action="";
}switch (action){
            default:
                try {
                    List<Customer> list=customerService.finAll();
                    request.setAttribute("list",list);
                    request.getRequestDispatcher("/customer/list.jsp").forward(request,response);
                } catch (SQLException e) {
                    e.printStackTrace();
                }

                break;
        }
    }
}
