package com.kuang.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

public class HelloServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //取得参数
        String method = request.getParameter("method");
        if(method.equals("add")){
            HttpSession session = request.getSession();
            session.setAttribute("message","执行了add()方法");
        }
        if(method.equals("delete")){
            HttpSession session = request.getSession();
            session.setAttribute("message","执行了delete()方法");
        }
        //跳转
        request.getRequestDispatcher("/WEB-INF/jsp/hello.jsp").forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }
}
