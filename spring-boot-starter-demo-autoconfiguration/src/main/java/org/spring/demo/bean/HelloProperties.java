package org.spring.demo.bean;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author cuibaoqiang
 * @date 2022-07-16 15:45:41
 * @desc
 */
@ConfigurationProperties("org.spring.demo")
public class HelloProperties {

    private String prefix;
    private String suffix;

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public String getSuffix() {
        return suffix;
    }

    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }
}
