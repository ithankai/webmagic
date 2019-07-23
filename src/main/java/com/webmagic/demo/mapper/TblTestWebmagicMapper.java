package com.webmagic.demo.mapper;

import com.webmagic.demo.entiy.TblTestWebmagic;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author  hankai
 * @date  2019/7/23 15:59
 * @version 1.0
 */
@Mapper
public interface TblTestWebmagicMapper {
    int insert(TblTestWebmagic record);

    int insertSelective(TblTestWebmagic record);
}