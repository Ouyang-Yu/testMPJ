package com.example.testdelete.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @author OuYang <a href="mailto:2455356027@qq.com">Mail</a>
 * @DateTime 2023/5/17 14:41
 */
@Data
@TableName("account")
public class Account {
    @TableId
    private Long id;
    private String name;
    private String age;
    private Long roleId;
}
