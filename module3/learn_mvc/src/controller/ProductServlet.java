package controller;

import model.Product;
import service.ProductService;
import service.ProductServiceIplm;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "ProductServlet", urlPatterns = {"", "/ProductServlet"})
public class ProductServlet extends HttpServlet {
    private ProductService productService = new ProductServiceIplm();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
//            case "create":
//                break;
//            case "edit":
//                break;
            default:
                show_list_product(request, response);
                break;
        }

    }

    private void show_list_product(HttpServletRequest request, HttpServletResponse response) {

        request.setAttribute("product", productService.findAll());
        try {
            request.getRequestDispatcher("web/list_product.jsp").forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
