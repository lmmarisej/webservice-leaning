package org.lmmarise.webservice.learning.server;

import org.apache.cxf.endpoint.Server;
import org.apache.cxf.jaxws.JaxWsServerFactoryBean;
import org.junit.jupiter.api.Test;
import org.lmmarise.webservice.lening.service.impl.HelloWorldServiceImpl;

import java.util.concurrent.CountDownLatch;

/**
 * @author lmmarise.j@gmail.com
 * @since 2022/9/25 00:41
 */
public class WebServiceServerTest {
    
    @Test
    public void server() throws InterruptedException {
        JaxWsServerFactoryBean jaxWsServerFactoryBean = new JaxWsServerFactoryBean();
        jaxWsServerFactoryBean.setAddress("http://localhost:9999/cxf_server");
        
        jaxWsServerFactoryBean.setServiceClass(HelloWorldServiceImpl.class);
        
        Server server = jaxWsServerFactoryBean.create();
        server.start();
    
        new CountDownLatch(1).await();
    }
    
}
