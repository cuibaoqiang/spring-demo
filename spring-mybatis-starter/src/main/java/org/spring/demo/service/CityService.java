package org.spring.demo.service;

import org.spring.demo.bean.City;

/**
 * @author cuibaoqiang
 * @date 2022-07-08 00:34:18
 * @desc
 */
public interface CityService {
    City getById(Long id);

    City addCity(City city);
}
