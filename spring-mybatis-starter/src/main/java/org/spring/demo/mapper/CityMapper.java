package org.spring.demo.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.spring.demo.bean.City;

/**
 * @author cuibaoqiang
 * @date 2022-07-08 00:30:28
 * @desc
 */
@Mapper
public interface CityMapper {

    @Select("select * from city_tbl where id = #{id}")
    City getById(Long id);

    void insert(City city);

}
