package vn.iotstar.controller;

import vn.iotstar.Dao.CategoryDao;
import vn.iotstar.Dao.impl.CategoryDaoImpl;
import vn.iotstar.entity.User;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;
import java.io.IOException;

@WebServlet("/manager/home")
public class ManagerHomeServlet extends HttpServlet {
    private CategoryDao categoryDao = new CategoryDaoImpl();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        User u = (User) req.getSession().getAttribute("user");
        req.setAttribute("categories", categoryDao.findByOwner(u.getId()));
        req.getRequestDispatcher("/manager/home.jsp").forward(req, resp);
    }
}
