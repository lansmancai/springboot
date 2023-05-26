package com.lansmancai.swagger.controller;

import com.lansmancai.swagger.model.User;
import com.lansmancai.swagger.util.JSONResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

@Api(tags = {"用户接口"})
@RestController
public class UserController {

    @ApiOperation(value="创建用户", notes="根据User对象创建用户")
    @PostMapping(value = "user")
    public JSONResult save(@RequestBody User user){
        System.out.println("用户创建成功："+user.getName());
        return JSONResult.ok(201,"用户创建成功");
    }

    @ApiOperation(value="更新用户详细信息", notes="根据id来指定更新对象，并根据传过来的user信息来更新用户详细信息")
    @PutMapping(value = "user")
    public JSONResult update(@RequestBody User user) {
        System.out.println("用户修改成功："+user.getName());
        return JSONResult.ok(203,"用户修改成功");
    }

    @ApiOperation(value="删除用户", notes="根据url的id来指定删除对象")
    @DeleteMapping("user/{userId}")
    public JSONResult delete(@PathVariable String userId) {
        System.out.println("用户删除成功："+userId);
        return JSONResult.ok(204,"用户删除成功");
    }

    @ApiOperation(value="查询用户",notes = "通过用户ID获取用户信息")
    @GetMapping("user/{userId}")
    public JSONResult queryUserById(@PathVariable String userId) {
        User user =new User();
        user.setUserId(userId);
        user.setName("weiz");
        user.setAge(20);
        System.out.println("获取用户成功："+userId);
        return JSONResult.ok(200,"获取用户成功",user);
    }
}
