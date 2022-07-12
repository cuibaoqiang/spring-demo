package org.spring.demo.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author cuibaoqiang
 * @date 2022-07-12 19:50:53
 * @desc
 */
public abstract class BaseController<T, S extends IService<T>> {

    @Autowired
    S service;

    /**
     * 分页查询
     */
    @RequestMapping("page")
    public Page<T> page(Long current, Long size) {
        Page<T> page = new Page<>(current, size);
        return service.page(page);
    }

    /**
     * 新增
     */
    @RequestMapping("add")
    public T add(T t) {
        boolean save = service.save(t);
        return t;
    }

    /**
     * 主键查询
     */
    @RequestMapping("/info")
    public T queryById(Long id) {
        return service.getById(id);
    }

    /**
     * 主键删除
     */
    @RequestMapping("delete")
    public boolean deleteById(Long id) {
        return service.removeById(id);
    }

    /**
     * 更新
     */
    @RequestMapping("update")
    public boolean updateById(T t) {
        return service.updateById(t);
    }

}
