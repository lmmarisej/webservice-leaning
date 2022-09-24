package org.lmmarise.webservice.lening.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author lmmarise.j@gmail.com
 * @since 2022/9/25 02:34
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@XmlRootElement
public class Employee {
    private Integer id;
    private String name;
    private Integer age;
}
