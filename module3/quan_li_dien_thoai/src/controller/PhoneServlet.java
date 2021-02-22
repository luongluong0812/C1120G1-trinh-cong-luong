package controller;

import service.IPhoneService;
import service.PhoneService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "PhoneServlet", urlPatterns = {"", "/phone"})
public class PhoneServlet extends HttpServlet {
    private IPhoneService phoneService=new PhoneService();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action){
            case "delete":int id=Integer.parseInt(request.getParameter("id"));
            request.setAttribute("phoneDelete",phoneService.findById(id));
            request.getRequestDispatcher("/phone/delete.jsp").forward(request,response);
            break;


            default:request.setAttribute("listPhone",phoneService.findAll());
            request.getRequestDispatcher("/phone/listPhone.jsp").forward(request,response);
            break;
        }
    }
}
