package org.spring.demo.config;

import org.springframework.boot.actuate.info.Info;
import org.springframework.boot.actuate.info.InfoContributor;
import org.springframework.stereotype.Component;

import java.util.Collections;

/**
 * @author cuibaoqiang
 * @date 2022-07-13 21:20:42
 * @desc 自定义info
 */
@Component
public class AppInfoContributor implements InfoContributor {
    @Override
    public void contribute(Info.Builder builder) {
        builder.withDetail("msg", "你好")
                .withDetails(Collections.singletonMap("hello", "哈哈哈"));
    }
}
