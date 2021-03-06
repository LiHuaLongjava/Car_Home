package com.autohome.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

@ApiModel(value = "com-autohome-entity-User")
@Data
public class User implements Serializable {
    /**
     *
     */
    @ApiModelProperty(value = "")
    private Integer id;

    /**
     * 账号
     */
    @ApiModelProperty(value = "账号")
    private String username;

    /**
     * 密码
     */
    @ApiModelProperty(value = "密码")
    private String password;

    /**
     * 性别 0女 1男
     */
    @ApiModelProperty(value = "性别 0女 1男")
    private Integer sex;

    /**
     * 名字
     */
    @ApiModelProperty(value = "名字")
    private String name;

    /**
     * 生日
     */
    @ApiModelProperty(value = "生日")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", locale = "zh", timezone = "GMT+8")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date birth;

    /**
     * 地址
     */
    @ApiModelProperty(value = "地址")
    private String address;

    /**
     * 手机
     */
    @ApiModelProperty(value = "手机")
    private String phone;

    /**
     * 邮箱
     */
    @ApiModelProperty(value = "邮箱")
    private String email;

    /**
     * 钱包
     */
    @ApiModelProperty(value = "钱包")
    private Double money;

    /**
     * 会员标记 0非会员 1会员
     */
    @ApiModelProperty(value = "会员标记 0非会员 1会员")
    private Integer vip;

    /**
     * 图片编号-外键
     */
    @ApiModelProperty(value = "头像")
    private Integer img_id;


    private static final long serialVersionUID = 1L;
}

