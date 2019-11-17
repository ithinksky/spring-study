package com.ithinksky.servlet.web;

import javax.servlet.*;
import java.io.IOException;

/**
 * 由组件进行初始化该 Filter
 *
 * @author tengpeng.gao
 * @since 2019/3/13
 */
public class TestFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) {
        System.out.println(" TestFilter init ...............");
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException,
            ServletException {
        System.out.println(" TestFilter doFilter ...............");
        chain.doFilter(request, response);
    }

    @Override
    public void destroy() {
        System.out.println(" TestFilter destroy ...............");
    }
}
