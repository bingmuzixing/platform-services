package com.bmzx.platform.core.de;

import lombok.Data;

/**
 * 元数据的标识类
 * @Description TODO
 * @Author liu418749406@163.com
 * @Date 2023/10/7 23:34
 */
@Data
public class DataElementIdentification extends BaseData{

    /**
     * 名称
     * @Description 名称
     * @Autothor liu418749406@163.com
     * @Date 2023/10/20 23:36
     */
    private String name;

    /**
     * 标识符
     * @Description 标识符
     * @Autothor liu418749406@163.com
     * @Date 2023/10/20 23:36
     */
    private String identifier;

    /**
     * 版本
     * @Description 版本
     * @Autothor liu418749406@163.com
     * @Date 2023/10/20 23:37
     */
    private String version;
    /**
     * 注册机构
     * @Description 注册机构
     * @Autothor liu418749406@163.com
     * @Date 2023/10/20 23:47
     */
    private String regOrg;
    /**
     * 同义名称
     * @Description 同义名称
     * @Autothor liu418749406@163.com
     * @Date 2023/10/20 23:47
     */
    private String subName;

    /**
     * 相关环境
     * @Description 相关环境
     * @Autothor liu418749406@163.com
     * @Date 2023/10/20 23:50
     */
    private String refContext;
}
 