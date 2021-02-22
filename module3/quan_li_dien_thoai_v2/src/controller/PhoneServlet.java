package controller;

import bean.Phone;
import service.IPhoneService;
import service.PhoneService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

@WebServlet(name = "PhoneServlet", urlPatterns = {"", "/phone"})
public class PhoneServlet extends HttpServlet {
    private IPhoneService phoneService = new PhoneService();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "add":
                int idAdd = Integer.parseInt(request.getParameter("id"));
                String nameAdd = request.getParameter("name");
                int priceAdd = Integer.parseInt(request.getParameter("price"));
                String colorAdd = request.getParameter("color");
                Phone phoneAdd = new Phone(idAdd, nameAdd, priceAdd, colorAdd);
                phoneService.add(phoneAdd);
                loadList(request,response);
                break;

            case "edit":
                int id = Integer.parseInt(request.getParameter("id"));
                String name = request.getParameter("name");
                int price = Integer.parseInt(request.getParameter("price"));
                String color = request.getParameter("color");
                Phone phone = new Phone(id, name, price, color);
                phoneService.edit(phone);
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
            case "add": request.setAttribute("add","add");
                request.getRequestDispatcher("/phone/create.jsp").forward(request,response);
                break;
            case "delete":
                int id = Integer.parseInt(request.getParameter("id"));
                try {
                    Phone phone = phoneService.finById(id);
                    request.setAttribute("phoneDelete", phone);
                    request.getRequestDispatcher("/phone/delete.jsp").forward(request, response);
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                break;
            case "yes":
                int idDelete = Integer.parseInt(request.getParameter("id"));
                phoneService.delete(idDelete);
                loadList(request, response);
                break;
            case "no":
                loadList(request, response);
                break;
            case "edit":
                int idEdit = Integer.parseInt(request.getParameter("id"));
                try {
                    Phone phone = phoneService.finById(idEdit);
                    request.setAttribute("phoneEdit", phone);
                    request.getRequestDispatcher("/phone/edit.jsp").forward(request, response);

                } catch (SQLException e) {
                    e.printStackTrace();
                }
                break;


            default:
                loadList(request, response);
                break;
        }

    }

    private void loadList(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("allPhone", phoneService.findAll());
        request.getRequestDispatcher("/phone/listPhone.jsp").forward(request, response);
    }
}
