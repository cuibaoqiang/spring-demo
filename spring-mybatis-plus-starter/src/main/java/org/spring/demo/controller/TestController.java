package org.spring.demo.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.spring.demo.bean.Account;
import org.spring.demo.bean.City;
import org.spring.demo.service.AccountService;
import org.spring.demo.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author cuibaoqiang
 * @date 2022-07-07 22:27:50
 * @desc
 */
@RestController
public class TestController {
    @Autowired
    private AccountService accountService;
    @Autowired
    private CityService cityService;

    @RequestMapping("accoount")
    public Account getById(Long id) {
        return accountService.getById(id);
    }

    @RequestMapping("page")
    public Page<Account> page(Long current, Long size) {
        Page<Account> page = new Page<>(current, size);
        return accountService.page(page);
    }

    @RequestMapping("city")
    public City getCityById(Long id) {
        return cityService.getById(id);
    }

    @RequestMapping("addCity")
    public City addCity(City city) {
        cityService.save(city);
        return city;
    }

}
