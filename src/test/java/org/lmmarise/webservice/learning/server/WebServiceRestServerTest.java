package org.lmmarise.webservice.learning.server;

import org.apache.cxf.endpoint.Server;
import org.apache.cxf.jaxrs.JAXRSServerFactoryBean;
import org.junit.jupiter.api.Test;
import org.lmmarise.webservice.lening.service.impl.HelloWorldRestServiceImpl;

import java.util.concurrent.CountDownLatch;

/**
 * @author lmmarise.j@gmail.com
 * @since 2022/9/25 00:41
 */
public class WebServiceRestServerTest {
    
    @Test
    public void restServer() throws InterruptedException {
        JAXRSServerFactoryBean jaxrsServerFactoryBean = new JAXRSServerFactoryBean();
        jaxrsServerFactoryBean.setAddress("http://localhost:9998/cxf_server/rest");
        
        jaxrsServerFactoryBean.setResourceClasses(HelloWorldRestServiceImpl.class);
        
        Server server = jaxrsServerFactoryBean.create();
        server.start();
        
        new CountDownLatch(1).await();
    }
    
}
