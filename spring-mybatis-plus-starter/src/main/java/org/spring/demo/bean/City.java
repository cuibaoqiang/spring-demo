package org.spring.demo.bean;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @author cuibaoqiang
 * @date 2022-07-08 00:31:05
 * @desc
 */
@Data
@TableName("City_tbl")
public class City {
    private Long id;
    private String name;
    private String state;
    private String country;
}
