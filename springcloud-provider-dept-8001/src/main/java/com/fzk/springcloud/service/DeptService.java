package com.fzk.springcloud.service;


import com.fzk.springcloud.pojo.Dept;


import java.util.List;


public interface DeptService {

        public boolean addDept(Dept dept);

        public Dept queryById(Long id);

        public List<Dept> queryAll();

    }


