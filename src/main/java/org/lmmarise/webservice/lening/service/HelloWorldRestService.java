package org.lmmarise.webservice.lening.service;

import org.lmmarise.webservice.lening.pojo.Employee;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

/**
 * @author lmmarise.j@gmail.com
 * @since 2022/9/25 02:27
 */
@Path("/employees")
public interface HelloWorldRestService {
    
    @GET
    @Path("/{id}")
    @Produces("application/xml")
    Employee getEmployeeById(@PathParam("id") Integer id);
    
}
