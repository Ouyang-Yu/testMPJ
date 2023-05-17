package com.example.testdelete.entity;

/**
 * @author OuYang <a href="mailto:2455356027@qq.com">Mail</a>
 * @DateTime 2023/5/17 14:38
 */

public class Role {
    private Long id;
    private String name;

    public Long getId() {
        return id;
    }

    public Role setId(Long id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public Role setName(String name) {
        this.name = name;
        return this;
    }
}
