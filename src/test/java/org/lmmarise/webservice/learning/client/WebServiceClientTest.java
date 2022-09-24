package org.lmmarise.webservice.learning.client;

import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;
import org.junit.jupiter.api.Test;
import org.lmmarise.webservice.lening.service.HelloWorldService;

/**
 * @author lmmarise.j@gmail.com
 * @since 2022/9/25 00:47
 */
public class WebServiceClientTest {

    @Test
    public void sayHello() {
        JaxWsProxyFactoryBean jaxWsProxyFactoryBean = new JaxWsProxyFactoryBean();
        jaxWsProxyFactoryBean.setAddress("http://localhost:9999/cxf_server");
        jaxWsProxyFactoryBean.setServiceClass(HelloWorldService.class);
    
        HelloWorldService helloWorldService = (HelloWorldService) jaxWsProxyFactoryBean.create();
    
        System.out.println(helloWorldService.sayHello("cxk", 2));
    }
    
    @Test
    public void sayHi() {
        JaxWsProxyFactoryBean jaxWsProxyFactoryBean = new JaxWsProxyFactoryBean();
        jaxWsProxyFactoryBean.setAddress("http://localhost:9999/cxf_server");
        jaxWsProxyFactoryBean.setServiceClass(HelloWorldService.class);
        
        HelloWorldService helloWorldService = (HelloWorldService) jaxWsProxyFactoryBean.create();
        
        System.out.println(helloWorldService.sayHi("cxk", 2));
    }
    
    
}
