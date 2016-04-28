package com.wallellen.spring.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by <a href="mailto:wallellen@hotmail.com">WALLE</a> on 4/28/16.
 */
public class IOCTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("");
    }
}
