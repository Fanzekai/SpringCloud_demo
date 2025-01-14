package com.fzk.springcloud.service;

import com.fzk.springcloud.pojo.Dept;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

/**
 * @author fzk
 * @version 1.0
 * @date 2023/3/13  23:56
 */


@Component
@FeignClient(value = "SPRINGCLOUD-PROVIDER-DEPT",fallbackFactory = DeptClientServiceFallBackFactory.class)
public interface DeptClientService {


    @GetMapping("/dept/get/{id}")
    public Dept queryById(@PathVariable("id") Long id);


    @GetMapping("/dept/list")
    public List<Dept> queryALl();

    @PostMapping("/dept/add")
    public boolean addDept(Dept dept);

}
