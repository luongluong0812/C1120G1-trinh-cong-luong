package controller;

import service.CustomerService;
import service.ICustomerSerVice;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

@WebServlet(name = "CustomerServlet", urlPatterns = {"", "/customer"})
public class CustomerServlet extends HttpServlet {
    private ICustomerSerVice customerSerVice = new CustomerService();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "delete":
                int id = Integer.parseInt(request.getParameter("id"));
                request.setAttribute("customerFind", customerSerVice.findById(id));
                request.getRequestDispatcher("/customer/delete.jsp").forward(request, response);
                break;
            default:
                loadList(request, response);
                break;
        }
    }

    private void loadList(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            request.setAttribute("allCustomer", customerSerVice.findAll());
            request.getRequestDispatcher("/customer/list.jsp").forward(request, response);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
