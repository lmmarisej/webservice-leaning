package org.lmmarise.webservice.lening.service;

import javax.jws.WebService;

/**
 * @author lmmarise.j@gmail.com
 * @since 2022/9/25 00:12
 */
@WebService
public interface HelloWorldService {

    String sayHello(String name, int age);
    
}
