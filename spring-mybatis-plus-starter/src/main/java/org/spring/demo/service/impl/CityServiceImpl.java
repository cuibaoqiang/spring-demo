package org.spring.demo.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.spring.demo.bean.City;
import org.spring.demo.mapper.CityMapper;
import org.spring.demo.service.CityService;
import org.springframework.stereotype.Service;

/**
 * @author cuibaoqiang
 * @date 2022-07-08 00:34:46
 * @desc
 */
@Service
public class CityServiceImpl extends ServiceImpl<CityMapper, City> implements CityService {


}
