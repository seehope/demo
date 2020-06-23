package com.ethan.codegen.service.impl;

import com.ethan.codegen.entity.BaseProduct;
import com.ethan.codegen.dao.BaseProductMapper;
import com.ethan.codegen.service.BaseProductService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 库存周转—基础数据—成品信息表 服务实现类
 * </p>
 *
 * @author Ethan
 * @since 2020-06-19
 */
@Service
public class BaseProductServiceImpl extends ServiceImpl<BaseProductMapper, BaseProduct> implements BaseProductService {

}
