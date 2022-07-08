package org.spring.demo.bean;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

/**
 * account_tbl
 * @author 
 */
@Data
@TableName("Account_tbl")
public class Account implements Serializable {
    private Long id;

    private String userId;

    private Integer money;

    private static final long serialVersionUID = 1L;
}