package com.ithinksky.spring;

import com.ithinksky.spring.aop.AbstractHandler;
import com.ithinksky.spring.aop.ProxyFactory;
import com.ithinksky.spring.aop.impl.AfterHandlerImpl;
import com.ithinksky.spring.aop.impl.AroundHandlerImpl;
import com.ithinksky.spring.aop.impl.BeforeHandlerImpl;
import com.ithinksky.spring.beans.Calculator;
import com.ithinksky.spring.beans.CalculatorImpl;

import java.util.ArrayList;
import java.util.List;

/**
 * @author tengpeng.gao
 * @since 2019-02-22
 */
public class TestAop {

    public static void main(String[] args) {

        CalculatorImpl calculatorImpl = new CalculatorImpl();

        List<AbstractHandler> handlerList = new ArrayList<>();
        BeforeHandlerImpl beforeHandler = new BeforeHandlerImpl();
        AfterHandlerImpl afterHandler = new AfterHandlerImpl();
        handlerList.add(beforeHandler);
        handlerList.add(afterHandler);

        Calculator proxy = (Calculator) ProxyFactory.getProxy(calculatorImpl, handlerList);
        int result = proxy.calculate(30, 20);
        System.out.println("Final Result :::" + result);

        System.out.println(" ====================== ");

        CalculatorImpl calculatorImplA = new CalculatorImpl();
        AroundHandlerImpl aroundHandler = new AroundHandlerImpl();
        Calculator proxyA = (Calculator) ProxyFactory.getProxy(calculatorImplA, aroundHandler);
        int resultA = proxyA.calculate(30, 20);
        System.out.println("Final ResultA :::" + resultA);

    }

}
