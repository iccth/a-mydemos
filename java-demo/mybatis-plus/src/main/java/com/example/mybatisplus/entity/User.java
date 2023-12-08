package com.example.mybatisplus.entity;

import java.util.Date;

@Data
public class User {

    //@TableId(type = IdType.ID_WORKER) //mp自带策略，生成19位值，数字类型使用这种策略，比如long
    //@TableId(type = IdType.ID_WORKER_STR) //mp自带策略，生成19位值，字符串类型使用这种策略
    //@TableId(type = IdType.INPUT) //需要手动输入id
    //@TableId(type = IdType.NONE) //没有策略，需要手动设置
    //@TableId(type = IdType.UUID) //用随机uuid
    @TableId(type = IdType.AUTO) //自增
    private Long id;

    private String name;
    private Integer age;
    private String email;

    @TableField(fill = FieldFill.INSERT)
    private Date createTime;

    @TableField(fill = FieldFill.INSERT_UPDATE)
    private Date updateTime;

    /**
     * 版本号
     */
    @Version
    @TableField(fill = FieldFill.INSERT)
    private Integer version;

    @TableLogic
    @TableField(fill = FieldFill.INSERT)
    private Integer deleted;
}
