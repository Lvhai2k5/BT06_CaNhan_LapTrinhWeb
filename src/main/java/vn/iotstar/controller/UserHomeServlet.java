package vn.iotstar.controller;

import vn.iotstar.Dao.CategoryDao;
import vn.iotstar.Dao.impl.CategoryDaoImpl;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;
import java.io.IOException;

@WebServlet("/user/home")
public class UserHomeServlet extends HttpServlet {
    private CategoryDao categoryDao = new CategoryDaoImpl();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        req.setAttribute("categories", categoryDao.findAll());
        req.getRequestDispatcher("/user/home.jsp").forward(req, resp);
    }
}
