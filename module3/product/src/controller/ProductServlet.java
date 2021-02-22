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

            case "edit":
                Product product = new Product();
                product.setId(Integer.valueOf(request.getParameter("id")));
                product.setName(request.getParameter("name"));
                product.setPrice(Integer.parseInt(request.getParameter("price")));
                product.setColor(request.getParameter("color"));
                try {
                    productService.save(product);
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                loadList(request, response);
                break;
            case "add":
                Product product1 = new Product();
                product1.setId(Integer.parseInt(request.getParameter("id1")));
                product1.setName(request.getParameter("name1"));
                product1.setPrice(Integer.parseInt(request.getParameter("price1")));
                product1.setColor(request.getParameter("color1"));
                try {
                    productService.createProduct(product1);
                } catch (SQLException e) {
                    e.printStackTrace();
                }

                break;


        }

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";

        }
        switch (action) {
            case "edit":
                int id = Integer.parseInt(request.getParameter("id"));
                try {
                    productService.findById(id);
                    request.setAttribute("product", productService.findById(id));
                    request.getRequestDispatcher("/product/edit.jsp").forward(request, response);
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                break;


//                int idUpdate=Integer.parseInt(request.getParameter("id"));
            case "delete":
                int idDelete = Integer.parseInt(request.getParameter("id"));
                try {
                    productService.deleteById(idDelete);
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                break;


            case "add":
                request.getRequestDispatcher("/product/add.jsp").forward(request, response);
                break;


            default:
                loadList(request, response);
                break;
        }
    }

    private void loadList(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            request.setAttribute("listProduct", productService.findAll());
            request.getRequestDispatcher("/product/productList.jsp").forward(request, response);
            return;
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
