package controller;

import bean.SanPham;
import service.ISanPhamService;
import service.SanPhamService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

@WebServlet(name = "SanPhamServlet", urlPatterns = {"", "/san_pham"})
public class SanPhamServlet extends HttpServlet {
    private ISanPhamService sanPhamService = new SanPhamService();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "create":
                int id = Integer.parseInt(request.getParameter("id"));
                String ten = request.getParameter("name");
                int gia = Integer.parseInt(request.getParameter("price"));
                int giam = Integer.parseInt(request.getParameter("muc_giam_gia"));
                int ton_kho = Integer.parseInt(request.getParameter("ton_kho"));
                SanPham sanPham = new SanPham(id, ten, gia, giam, ton_kho);
                try {
                    sanPhamService.create(sanPham);
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
            case "create":
                request.getRequestDispatcher("/san_pham/create.jsp").forward(request, response);
                break;
            default:
                loadList(request, response);
                break;
        }

    }

    private void loadList(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("danhSach", sanPhamService.finAll());
        request.getRequestDispatcher("/san_pham/san_pham.jsp").forward(request, response);
    }
}
