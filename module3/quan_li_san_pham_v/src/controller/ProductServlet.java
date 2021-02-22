package controller;

import bean.Product;
import service.IProductService;
import service.ProductService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

@WebServlet(name = "ProductServlet", urlPatterns = {"", "/product"})
public class ProductServlet extends HttpServlet {
    private IProductService productService = new ProductService();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";

        }
        switch (action) {
            case "add":
                Product product = null;
                int idAdd = Integer.parseInt(request.getParameter("id"));
                String nameAdd = request.getParameter("name");
                int priceAdd = Integer.parseInt(request.getParameter("price"));
                String colorAdd = request.getParameter("color");
                product = new Product(idAdd, nameAdd, priceAdd, colorAdd);
                loadList(request, response);

                try {
                    productService.addNew(product);
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                break;
            case "edit":
                Product product1 = null;
                int id = Integer.parseInt(request.getParameter("idEdit"));
                String name = request.getParameter("nameEdit");
                int price = Integer.parseInt(request.getParameter("priceEdit"));
                String color = request.getParameter("colorEdit");
                product1 = new Product(id, name, price, color);
                productService.edit(product1);
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
            case "add":
                request.getRequestDispatcher("/product/create.jsp").forward(request, response);

                break;
            case "edit":
                int id = Integer.parseInt(request.getParameter("id"));
                request.setAttribute("productEdit", productService.findByID(id));
                request.getRequestDispatcher("/product/edit.jsp").forward(request, response);
                break;
            default:
                loadList(request, response);
                break;
        }
    }

    private void loadList(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("allProduct", productService.finAll());
        request.getRequestDispatcher("/product/list.jsp").forward(request, response);
    }
}
