package org.spring.demo.service.impl;

import org.spring.demo.bean.City;
import org.spring.demo.mapper.CityMapper;
import org.spring.demo.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author cuibaoqiang
 * @date 2022-07-08 00:34:46
 * @desc
 */
@Service
public class CityServiceImpl implements CityService {
    @Autowired
    private CityMapper cityMapper;

    @Override
    public City getById(Long id) {
        return cityMapper.getById(id);
    }

    @Override
    public City addCity(City city) {
        cityMapper.addCity(city);
        return city;
    }

    @Override
    public City saveCity(City city) {
        cityMapper.insert(city);
        return city;
    }

}
