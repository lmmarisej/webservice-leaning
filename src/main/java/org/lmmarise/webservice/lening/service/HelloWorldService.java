package org.lmmarise.webservice.lening.service;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

/**
 * @author lmmarise.j@gmail.com
 * @since 2022/9/25 00:12
 */
@WebService
public interface HelloWorldService {

    String sayHello(String name, int age);
    
    @WebMethod
    @WebResult(name = "sayHiReturnValue")
    String sayHi(@WebParam(name = "hiName") String name, @WebParam(name = "hiAge")int age);
    
}
