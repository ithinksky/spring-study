package com.ithinksky.servlet.web;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * 由组件进行初始化该 ServletContextListener
 *
 * @author tengpeng.gao
 * @since 2019/3/13
 */
public class TestListener implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println(" TestListener contextInitialized ...............");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        System.out.println(" TestListener contextDestroyed ...............");
    }
}
