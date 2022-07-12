package org.spring.demo.controller;

import org.spring.demo.bean.Account;
import org.spring.demo.service.AccountService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author cuibaoqiang
 * @date 2022-07-12 19:55:53
 * @desc
 */
@RestController
@RequestMapping("account")
public class AccountController extends BaseController<Account, AccountService> {


}
