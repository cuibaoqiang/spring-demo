package org.spring.demo.springdruid;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;
import java.util.Map;

@Slf4j
@SpringBootTest
class SpringJdbcApplicationTests {

    @Autowired
    JdbcTemplate jdbcTemplate;

    @Test
    void contextLoads() {
        List<Map<String, Object>> maps = jdbcTemplate.queryForList("select * from account_tbl");
        log.info("{}", maps);
        Long count = jdbcTemplate.queryForObject("select count(*) from account_tbl", Long.class);
        log.info("记录总数 {}", count);
    }
}