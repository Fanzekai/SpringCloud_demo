package com.fzk.springcloud.controller;


import com.fzk.springcloud.pojo.Dept;
import com.fzk.springcloud.service.DeptService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//提供restful服务
@RestController
public class DeptController {

    @Autowired
    private DeptService deptService;
    /**
     * 根据id查询部门信息
     * 如果根据id查询出现异常,则走hystrixGet这段备选代码
     * @param id
     * @return
     */
    @HystrixCommand(fallbackMethod = "hystrixGet")
    @RequestMapping("/dept/get/{id}")//根据id查询
    public Dept get(@PathVariable("id") Long id){
        Dept dept = deptService.queryById(id);
        if (dept==null){
            throw new RuntimeException("这个id=>"+id+",不存在该用户，或信息无法找到~");
        }
        return dept;
    }
    /**
     * 根据id查询备选方案(熔断)
     * @param id
     * @return
     */
    public Dept hystrixGet(@PathVariable("id") Long id){
        return new Dept().setDeptno(id)
                .setDname("这个id=>"+id+",没有对应的信息,null---@Hystrix~")
                .setDb_source("在MySQL中没有这个数据库");
    }
}
