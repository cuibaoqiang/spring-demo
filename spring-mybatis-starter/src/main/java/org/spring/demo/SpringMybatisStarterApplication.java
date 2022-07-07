package org.spring.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author cuibaoqiang
 * @date 2022-07-07 21:41:07
 * @desc
 */
//@MapperScan("org.spring.demo.mapper")
@SpringBootApplication
public class SpringMybatisStarterApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringMybatisStarterApplication.class, args);
    }
}
