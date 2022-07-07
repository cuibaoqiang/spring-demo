package org.spring.demo.service.impl;

import org.spring.demo.bean.Account;
import org.spring.demo.mapper.AccountMapper;
import org.spring.demo.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author cuibaoqiang
 * @date 2022-07-07 22:29:40
 * @desc
 */
@Service
public class AccountServiceImpl implements AccountService {
    @Autowired
    private AccountMapper accountMapper;

    @Override
    public Account getById(Long id) {
        return accountMapper.selectByPrimaryKey(id);
    }
}
