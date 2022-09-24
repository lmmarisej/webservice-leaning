package org.lmmarise.webservice.lening.service.impl;

import org.lmmarise.webservice.lening.pojo.Employee;
import org.lmmarise.webservice.lening.service.HelloWorldRestService;

/**
 * @author lmmarise.j@gmail.com
 * @since 2022/9/25 02:36
 */
@SuppressWarnings("all")
public class HelloWorldRestServiceImpl implements HelloWorldRestService {
    
    @Override
    public Employee getEmployeeById(Integer id) {
        Employee employee = new Employee(id, "cxk", 24);
        return employee;
    }
}
