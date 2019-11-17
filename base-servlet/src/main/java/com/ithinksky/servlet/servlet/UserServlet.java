package com.ithinksky.servlet.servlet;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 使用注解方式的定义 Servlet
 *
 * @author tengpeng.gao
 * @since 2019/3/13
 */
@WebServlet("/user")
public class UserServlet extends HttpServlet {

    @Override
    public void init() {
        System.out.println(" UserServlet init ...............");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        resp.getWriter().print(" User Info ...............");
    }

}
