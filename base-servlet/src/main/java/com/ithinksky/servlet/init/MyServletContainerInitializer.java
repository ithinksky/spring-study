package com.ithinksky.servlet.init;

import com.ithinksky.servlet.service.IUserService;
import com.ithinksky.servlet.web.TestFilter;
import com.ithinksky.servlet.web.TestListener;
import com.ithinksky.servlet.web.TestServlet;

import javax.servlet.DispatcherType;
import javax.servlet.ServletContainerInitializer;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.HandlesTypes;
import java.util.EnumSet;
import java.util.Set;

/**
 * 在web容器启动时为提供给第三方组件机会做一些初始化的工作
 * （可以参见 Spring MVC 对此做的一些扩展)
 *
 * init: listener > filter > servlet
 * destroy: servlet > filter > listener
 *
 * @author tengpeng.gao
 * @since 2019/3/13
 */
@HandlesTypes(IUserService.class)
public class MyServletContainerInitializer implements ServletContainerInitializer {

    @Override
    public void onStartup(Set<Class<?>> c, ServletContext ctx) throws ServletException {

        System.out.println("在web容器启动时，执行了我……");
        // HandlesTypes 指定类型的子类型， 顺序不固定
        for (Class clazz : c) {
            System.out.println(" === " + clazz.getName());
        }

        ctx.addServlet("testServlet", TestServlet.class)
                .addMapping("/testServlet");
        ctx.addFilter("testFilter", TestFilter.class)
                .addMappingForUrlPatterns(EnumSet.of(DispatcherType.REQUEST), false, "/testServlet");
        ctx.addListener(TestListener.class);


    }
}
