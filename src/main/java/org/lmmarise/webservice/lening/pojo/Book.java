package org.lmmarise.webservice.lening.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author lmmarise.j@gmail.com
 * @since 2022/9/25 01:42
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@XmlRootElement
public class Book {
    String name;
    String category;
    int price;
}
