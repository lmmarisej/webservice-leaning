package org.lmmarise.webservice.lening.service.impl;

import org.lmmarise.webservice.lening.service.HelloWorldService;

/**
 * @author lmmarise.j@gmail.com
 * @since 2022/9/25 00:13
 */
public class HelloWorldServiceImpl implements HelloWorldService {
    
    @Override
    public String sayHello(String name, int age) {
        return "Hello " + name + ", you are " + age + " years old.";
    }
}
