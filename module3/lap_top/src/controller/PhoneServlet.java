package controller;

import service.IPhoneService;
import service.PhoneService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

@WebServlet(name = "PhoneServlet",urlPatterns = "/phone")
public class PhoneServlet extends HttpServlet {
    private IPhoneService phoneService=new PhoneService();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
String action=request.getParameter("action");
if(action==null){
    action="";
} switch (action){
            default:
                try {
                    request.setAttribute("phoneList",phoneService.findAll());
                    request.getRequestDispatcher("/phone/listPhone.jsp").forward(request,response);
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                break;
        }
    }
}
