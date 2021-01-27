package controller;

import model.Product;
import service.productService;
import service.productServiceIplm;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "productServlet",urlPatterns = {"","/productServlet"})
public class productServlet extends HttpServlet {
    private static productService  productService=new productServiceIplm();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action=request.getParameter("action");
        if(action==null){
            action=" ";
        } else {
            switch (action){
                case "delete": break;
                case "update":
                    int id = Integer.parseInt(request.getParameter("id"));
                    Product product= productService.findById(id);
                    request.setAttribute("produceInfo",product);
                    request.getRequestDispatcher("update.jsp").forward(request,response);
                    break;
                default:   request.setAttribute("productFromSevlet", productService.findAll());
                request.getRequestDispatcher("product_list.jsp").forward(request, response);
                break;
            }

        }

    }
}
