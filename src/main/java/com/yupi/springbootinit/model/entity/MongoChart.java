package com.yupi.springbootinit.model.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableLogic;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import nonapi.io.github.classgraph.json.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.Date;

@Document("chart")  //对应emp集合中的一个文档
@Data
@AllArgsConstructor
@NoArgsConstructor
public class MongoChart {

    /**
     * id
     */
    @Id
    private Long id;

    /**
     * 名称
     */
    @Field
    private String name;

    /**
     * 分析目标
     */
    @Field
    private String goal;

    /**
     * 图表数据
     */
    @Field
    private String chartData;

    /**
     * 图表类型
     */
    @Field
    private String chartType;

    /**
     * 生成的图表数据
     */
    @Field
    private String genChart;

    /**
     * 生成的图表结论
     */
    @Field
    private String genResult;

    /**
     * 用户id
     */
    @Field
    private Long userId;
    /**
     * 创建时间
     */
    @Field
    private Date createTime;

    /**
     * 更新时间
     */
    @Field
    private Date updateTime;

    /**
     * 是否删除
     */
    @TableLogic
    private Integer isDelete;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;


}
