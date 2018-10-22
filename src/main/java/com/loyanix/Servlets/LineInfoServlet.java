package com.loyanix.Servlets;

import com.loyanix.DAO.LineInfoDao;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class LineInfoServlet extends HttpServlet {
    protected void post(HttpServletRequest request, HttpServletResponse response){

    }

    protected void get(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        LineInfoDao.setId(id);
        request.setAttribute("lineInfo", LineInfoDao.get());
        request.getRequestDispatcher("lineinfo.jsp").forward(request,response);

    }
}
