package org.spring.demo;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.StringRedisTemplate;

@Slf4j
@SpringBootTest
class SpringBootStarterTests {

    @Autowired
    StringRedisTemplate redisTemplate;

    @Test
    void redis() {
        redisTemplate.opsForValue().set("hello", "world");
        log.info(redisTemplate.opsForValue().get("hello"));
    }
}
