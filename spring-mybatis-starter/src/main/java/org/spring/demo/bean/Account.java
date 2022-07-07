package org.spring.demo.bean;

import java.io.Serializable;
import lombok.Data;

/**
 * account_tbl
 * @author 
 */
@Data
public class Account implements Serializable {
    private Long id;

    private String userId;

    private Integer money;

    private static final long serialVersionUID = 1L;
}