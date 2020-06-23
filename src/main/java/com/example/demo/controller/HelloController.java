package com.example.demo.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.demo.entity.BaseProduct;
import com.example.demo.mapper.BaseProductMapper;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;


/**
 * Class HelloController
 * <p>
 *
 * @author shunhong
 * @since 1.0.0
 * </p>
 */
@RestController
public class HelloController {

    @Resource
    BaseProductMapper mapper;

    @RequestMapping("/hello")
    public String index() {
        return "Hello World";
    }

    @GetMapping("/product")
    public List<BaseProduct> getProduct(){
        return mapper.selectAll();
    }

    @RequestMapping("/selectPage")
    public IPage<BaseProduct> selectMyPage() {
        QueryWrapper<BaseProduct> queryWrapper = new QueryWrapper<>();

        IPage<BaseProduct> memberPage = new Page<>(1, 2);

//        List<Object> list = new ArrayList<>();
//        list.add(selectPage.getPages());        //  总页数
//        list.add(selectPage.getTotal());        //  总记录数
//        list.addAll(selectPage.getRecords());   //  当前页数据
//
//        System.out.println(selectPage.getRecords());

        return mapper.selectPage(memberPage, queryWrapper);
    }
}
