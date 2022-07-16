package org.spring.demo.service;

import org.spring.demo.bean.HelloProperties;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author cuibaoqiang
 * @date 2022-07-16 15:43:46
 * @desc 默认不要放在容器中
 */
public class HelloService {

    @Autowired
    HelloProperties helloProperties;


    public String sayHello(String userName) {
        return helloProperties.getPrefix() + ": " + userName + "》" + helloProperties.getSuffix();
    }

}
