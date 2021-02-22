package controller;

import bean.Laptop;
import service.ILaptopService;
import service.LaptopService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

@WebServlet(name = "LaptopServlet", urlPatterns = {"", "/laptop"})
public class LaptopServlet extends HttpServlet {
    private ILaptopService laptopService = new LaptopService();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action){
            case "create":
                int idAdd= Integer.parseInt(request.getParameter("id"));
                String nameAdd=request.getParameter("name");
                int priceAdd= Integer.parseInt(request.getParameter("price"));
                String colorAdd=request.getParameter("color");
                Laptop laptopAdd=new Laptop(idAdd,nameAdd,priceAdd,colorAdd);
                laptopService.create(laptopAdd);
                loadList(request,response);
                break;
            case "search":String key=request.getParameter("key");
                try {
                    laptopService.findByName(key);
                    request.setAttribute("resultSearch", laptopService.findByName(key));
                    request.getRequestDispatcher("/laptop/result.jsp").forward(request,response);
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                break;
            case "edit":int id= Integer.parseInt(request.getParameter("id"));
            String name=request.getParameter("name");
            int price= Integer.parseInt(request.getParameter("price"));
            String color=request.getParameter("color");
            Laptop laptop=new Laptop(id,name,price,color);
                try {
                    laptopService.edit(laptop);
                } catch (SQLException e) {
                    e.printStackTrace();
                }
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
            case "create":
                request.getRequestDispatcher("/laptop/create.jsp").forward(request,response);

                break;

            case "edit": int idEdit = Integer.parseInt(request.getParameter("id"));
                try {
                    Laptop laptop = laptopService.findById(idEdit);
                    request.setAttribute("laptopEdit", laptop);
                    request.getRequestDispatcher("/laptop/edit.jsp").forward(request, response);
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                break;
            case "yes":
                int id = Integer.parseInt(request.getParameter("id"));
                String name = request.getParameter("name");
                int price = Integer.parseInt(request.getParameter("price"));
                String color = request.getParameter("color");
                Laptop laptopDelete = new Laptop(id, name, price, color);
                try {
                    laptopService.delete(laptopDelete);
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                loadList(request, response);
                break;
            case "delete":
                int idDelete = Integer.parseInt(request.getParameter("id"));
                try {
                    Laptop laptop = laptopService.findById(idDelete);
                    request.setAttribute("laptopDelete", laptop);
                    request.getRequestDispatcher("/laptop/delete.jsp").forward(request, response);
                } catch (SQLException e) {
                    e.printStackTrace();
                }

                break;
            case "no":loadList(request,response);
            break;
            default:
                loadList(request, response);
                break;
        }

    }

    private void loadList(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            request.setAttribute("listLaptop", laptopService.findAll());
            request.getRequestDispatcher("/laptop/listLaptop.jsp").forward(request, response);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
