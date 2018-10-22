package com.loyanix.Servlets;

import com.loyanix.DAO.FileInfoDao;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class FileInfoServlet extends HttpServlet {
    protected void doPost(){

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("fileInfo", FileInfoDao.get());
        request.getRequestDispatcher("fileinfo.jsp").forward(request,response);
    }
}
