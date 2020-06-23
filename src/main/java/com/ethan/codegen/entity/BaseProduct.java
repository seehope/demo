package com.ethan.codegen.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 库存周转—基础数据—成品信息表
 * </p>
 *
 * @author Ethan
 * @since 2020-06-19
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("base_product")
public class BaseProduct extends Model<BaseProduct> {

    private static final long serialVersionUID=1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 慕可代码
     */
    private String mkCode;

    /**
     * 所属品牌ID
     */
    private Integer brandId;

    /**
     * 所属分级ID
     */
    private Integer categoryId;

    /**
     * 产品货号
     */
    private String itemNumber;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
