package org.lmmarise.webservice.learning.client;

import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.junit.jupiter.api.Test;
import org.lmmarise.webservice.lening.pojo.Book;
import org.lmmarise.webservice.lening.pojo.Employee;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.IOException;
import java.io.InputStream;

/**
 * @author lmmarise.j@gmail.com
 * @since 2022/9/25 00:47
 */
public class WebServiceRestClientTest {
    
    @Test
    public void sayHello() throws IOException {
        CloseableHttpClient httpClient = HttpClientBuilder.create().build();
        
        HttpGet httpGet = new HttpGet("http://localhost:9998/cxf_server/rest/employees/1");
        
        CloseableHttpResponse response = httpClient.execute(httpGet);
        HttpEntity entity = response.getEntity();
        
        try (InputStream in = entity.getContent()) {
            JAXBContext jaxbContext = JAXBContext.newInstance(Employee.class);
            Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
            Employee employee = (Employee) unmarshaller.unmarshal(in);          // 将响应结果反序列化
            System.err.println(employee);
        } catch (JAXBException e) {
            throw new RuntimeException(e);
        }
    }
    
    
}
