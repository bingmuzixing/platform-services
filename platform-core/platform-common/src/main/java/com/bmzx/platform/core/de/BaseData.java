package com.bmzx.platform.core.de;

import lombok.Data;

import java.io.Serializable;

/**
 * @Description TODO
 * @Author liu418749406@163.com
 * @Date 2023/10/20 22:30
 */
@Data
public class BaseData implements Serializable {
    /**
     *
     * 创建人id
     * @Description TODO
     * @Autothor liu418749406@163.com
     * @Date 2023/11/20 20:57
     */

    private Long createById;
    /**
     * 创建时间
     * @Description TODO
     * @Autothor liu418749406@163.com
     * @Date 2023/11/20 20:59
     */
    private String createTime;


    /**
     * 修改人id
     * @Description TODO
     * @Autothor liu418749406@163.com
     * @Date 2023/11/20 20:58
     */

    private Long modifyById;
    /**
     * 修改时间
     * @Description TODO
     * @Autothor liu418749406@163.com
     * @Date 2023/11/20 20:59
     */
    private String modifyTime;
}
