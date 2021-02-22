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

@WebServlet(name = "CustomerServlet", urlPatterns = {"", "/customer"})
public class CustomerServlet extends HttpServlet {
    private ICustomerService customerService = new CustomerService();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "search":String key=request.getParameter("key");
                try {
                    request.setAttribute("result",  customerService.findByName(key));
                    request.getRequestDispatcher("/customer/result.jsp").forward(request,response);
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                break;


            case "edit":
                //    public Customer(int customerId, String customerName, String contactName,
                //    String address, String city, String postalCode, String country) {
                int customerId = Integer.parseInt(request.getParameter("customerId"));
                String customerName = request.getParameter("customerName");
                String contactName = request.getParameter("contactName");
                String address = request.getParameter("address");
                String city = request.getParameter("city");
                String postalCode = request.getParameter("postalCode");
                String country = request.getParameter("country");
                Customer customer = new Customer(customerId, customerName, contactName, address, city, postalCode, country);

                try {
                    customerService.edit(customer);
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                loadList(request, response);
                break;
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "delete":
                int idDelete = Integer.parseInt(request.getParameter("id"));
                try {
                    request.setAttribute("customerDelete", customerService.finById(idDelete));
                    request.getRequestDispatcher("/customer/delete.jsp").forward(request, response);
                } catch (SQLException e) {
                    e.printStackTrace();
                }


                break;
            case "edit":
                int id = Integer.parseInt(request.getParameter("id"));
                try {
                    request.setAttribute("customerEdit", customerService.finById(id));
                    request.getRequestDispatcher("/customer/edit.jsp").forward(request, response);
                } catch (SQLException e) {
                    e.printStackTrace();
                }


                break;
            case "yes":
                int idYes = Integer.parseInt(request.getParameter("id"));
                try {
                    customerService.delele(idYes);
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                loadList(request, response);
                break;
            default:
                loadList(request, response);
                break;
        }
    }

    private void loadList(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            request.setAttribute("customerList", customerService.findAll());
            request.getRequestDispatcher("/customer/list.jsp").forward(request, response);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
