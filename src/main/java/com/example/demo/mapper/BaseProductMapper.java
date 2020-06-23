package com.example.demo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.demo.entity.BaseProduct;

import java.util.List;

/**
 * <p>
 * 库存周转—基础数据—成品信息表 Mapper 接口
 * </p>
 *
 * @author Ethan
 * @since 2020-06-19
 */
public interface BaseProductMapper extends BaseMapper<BaseProduct> {

    List<BaseProduct> selectAll();

}
