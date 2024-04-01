package com.fzk.springcloud.controller;


import com.fzk.springcloud.pojo.Dept;
import com.fzk.springcloud.service.DeptClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.List;



@RestController
public class DeptConsumerController {
    /**
     * 理解：消费者，不应该有service层~
     * RestTemplate .... 供我们直接调用就可以了！ 注册到Spring中
     * (地址：url, 实体：Map ,Class<T> responseType)
     * <p>
     * 提供多种便捷访问远程http服务的方法，简单的Restful服务模板~
     */


    /**
     *用feign调用api中接口的方法，api中的方法通过url调用800X服务
     * **/

    @Autowired
    private DeptClientService service=null;


    /**
     * 消费方添加部门信息
     * @param dept
     * @return
     */
    @RequestMapping("/feign/dept/add")
    public boolean add(Dept dept) {
        System.out.println("--------aaaa");
        return this.service.addDept(dept);

    }


    /**
     * 消费方根据id查询部门信息
     * @param id
     * @return
     */
    @RequestMapping("/feign/dept/get/{id}")
    public Dept get(@PathVariable("id") Long id) {
        System.out.println("--------bbbb");
        return this.service.queryById(id);
    }


    /**
     * 消费方查询部门信息列表
     * @return
     */
    @RequestMapping("/feign/dept/list")
    public List<Dept> list() {
        System.out.println("-----------cccc");
        return this.service.queryALl();
    }
}
