package org.spring.demo.service;

import org.spring.demo.bean.Account;

/**
 * @author cuibaoqiang
 * @date 2022-07-07 22:29:02
 * @desc
 */
public interface AccountService {

    Account getById(Long id);
}
