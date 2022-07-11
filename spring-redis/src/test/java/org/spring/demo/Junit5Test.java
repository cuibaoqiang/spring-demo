package org.spring.demo;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author cuibaoqiang
 * @date 2022-07-10 22:49:21
 * @desc
 */
@SpringBootTest
@DisplayName("测试")
public class Junit5Test {

    @Test
    @DisplayName("Test")
    public void test() {
        System.out.println(1);
    }

    @BeforeEach
    void beforeEach() {
        System.out.println("beforeEach");
    }

    @AfterEach
    void afterEach() {
        System.out.println("afterEach");
    }
}
