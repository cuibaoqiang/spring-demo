package org.spring.demo;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.spring.demo.mapper.CityMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@Slf4j
@SpringBootTest
class SpringTests {
    @Autowired
    CityMapper cityMapper;

    @Test
    void contextLoads() {
        log.info("{}", cityMapper.selectById(1));
    }
}