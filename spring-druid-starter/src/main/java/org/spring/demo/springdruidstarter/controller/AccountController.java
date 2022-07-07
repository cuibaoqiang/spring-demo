package org.spring.demo.springdruidstarter.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

/**
 * @author cuibaoqiang
 * @date 2022-07-07 08:23:13
 * @desc
 */
@RestController
public class AccountController {

    @Autowired
    JdbcTemplate jdbcTemplate;


    @RequestMapping("sql")
    public List sql() {
        List<Map<String, Object>> maps = jdbcTemplate.queryForList("select * from account_tbl");
        return maps;
    }
}
