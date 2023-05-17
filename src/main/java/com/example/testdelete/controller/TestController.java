package com.example.testdelete.controller;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.example.testdelete.entity.Account;
import com.example.testdelete.entity.AccountDTO;
import com.example.testdelete.entity.Role;
import com.example.testdelete.mapper.AccountMapper;
import com.github.yulichang.wrapper.MPJLambdaWrapper;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author OuYang <a href="mailto:2455356027@qq.com">Mail</a>
 * @DateTime 2023/5/17 14:32
 */
@RestController
public class TestController {

    @Resource
    private AccountMapper accountMapper;

    @GetMapping("/1")
    public Object test() {

        return accountMapper.selectJoinList(
                AccountDTO.class,
                new MPJLambdaWrapper<Account>() {{
                    selectAll(Account.class);
                    selectAs(Role::getName, AccountDTO::getRoleName);

                    leftJoin(Role.class, Role::getId, Account::getRoleId);

                    ge(Account::getId, 1);
                }}
        );
    }

    @GetMapping("/2")
    public Object test2() {
        return accountMapper.selectList(new LambdaQueryWrapper<Account>() {{
            ge(Account::getId, 1);
        }})+"";
    }
}
