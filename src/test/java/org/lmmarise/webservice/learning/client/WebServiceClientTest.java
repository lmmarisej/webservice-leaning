package org.lmmarise.webservice.learning.client;

import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;
import org.junit.jupiter.api.Test;
import org.lmmarise.webservice.lening.pojo.Book;
import org.lmmarise.webservice.lening.service.HelloWorldService;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.StringReader;

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
    
    @Test
    public void marshaller() throws JAXBException {
        JAXBContext jaxbContext = JAXBContext.newInstance(Book.class);
        Marshaller marshaller = jaxbContext.createMarshaller();
        
        marshaller.setProperty(Marshaller.JAXB_ENCODING, "utf-8");
        
        // <?xml version="1.0" encoding="utf-8" standalone="yes"?>
        // <book>
        //      <category>文学</category>
        //      <name>武松打虎</name>
        //      <price>11</price>
        // </book>
        marshaller.marshal(new Book("武松打虎", "文学", 11), System.out);
    }
    
    @Test
    public void unmarshaller() throws JAXBException {
        String xml = "<?xml version=\"1.0\" encoding=\"utf-8\" standalone=\"yes\"?><book><category>文学</category><name>武松打虎</name><price>11</price></book>";
        JAXBContext jaxbContext = JAXBContext.newInstance(Book.class);
        Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
        Book book = (Book) unmarshaller.unmarshal(new StringReader(xml));
        System.out.println(book);
    }
    
    
}
