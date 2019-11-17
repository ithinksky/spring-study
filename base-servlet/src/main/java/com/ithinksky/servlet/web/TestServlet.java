package com.ithinksky.servlet.web;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 由组件进行初始化该 Servlet
 *
 * @author tengpeng.gao
 * @since 2019/3/13
 */
public class TestServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        resp.getWriter().print(" TestServlet Info ...............");
    }

    @Override
    public void init() {
        System.out.println(" TestServlet init ...............");
    }

    @Override
    public void destroy() {
        System.out.println(" TestServlet destroy ...............");
    }

}
