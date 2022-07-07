package org.spring.demo.controller;

import org.spring.demo.bean.Account;
import org.spring.demo.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author cuibaoqiang
 * @date 2022-07-07 22:27:50
 * @desc
 */
@RestController
public class AccountController {
    @Autowired
    private AccountService accountService;

    @RequestMapping("accoount")
    public Account getById(Long id) {
        return accountService.getById(id);
    }
}
