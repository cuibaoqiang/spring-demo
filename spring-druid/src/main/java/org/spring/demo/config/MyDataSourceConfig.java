package org.spring.demo.config;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.support.http.StatViewServlet;
import com.alibaba.druid.support.http.WebStatFilter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;
import java.util.Arrays;
import java.util.Collections;

/**
 * @author cuibaoqiang
 * @date 2022-07-06 21:49:05
 * @desc
 */
@Configuration
public class MyDataSourceConfig {

    /**
     * 根据spring.datasource 前缀设置Druid连接属性
     * @return
     */
    @Bean
    @ConfigurationProperties(prefix = "spring.datasource")
    public DataSource dataSource() {
        DruidDataSource dataSource = new DruidDataSource();
        return dataSource;
    }

    /**
     * 开启Druid监控页面
     * @return
     */
    @Bean
    public ServletRegistrationBean registrationBean() {
        StatViewServlet statViewServlet = new StatViewServlet();
        ServletRegistrationBean<StatViewServlet> registrationBean = new ServletRegistrationBean<StatViewServlet>(statViewServlet, "/druid/*");
        registrationBean.addInitParameter("loginUsername","root");
        registrationBean.addInitParameter("loginPassword","root");
        return registrationBean;
    }

    /**
     * 开启druid web应用uri监控
     */
    @Bean
    public FilterRegistrationBean filterRegistrationBean() {
        WebStatFilter webStatFilter = new WebStatFilter();
        FilterRegistrationBean<WebStatFilter> webStatFilterFilterRegistrationBean = new FilterRegistrationBean<>(webStatFilter);
        webStatFilterFilterRegistrationBean.setUrlPatterns(Collections.singletonList("/*"));
        webStatFilterFilterRegistrationBean.addInitParameter("exclusions","*.html,*.js,*.css,*.json");
        return webStatFilterFilterRegistrationBean;
    }
}
