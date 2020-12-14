package com.wxk.repository;

import com.wxk.controller.BaseHandler;
import com.wxk.entity.Dept;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author 478
 * @data 2020/10/31 - 10:31
 */
@SpringBootTest
class DeptRepositoryTest extends BaseHandler {
    @Autowired
    private DeptRepository deptRepository;
    @Test
    void findAll(){
        System.out.println("deptRepository = " + deptRepository.selectAll());
    }

    @Test
    void saveDept(){
        Dept dept = new Dept();
        dept.setId("9999");
        dept.setDeptName("王小康洪勇");
        this.deptRepository.insertSelective(dept);
    }

    @Test
    void updateDept(){
        Dept dept = new Dept();
        dept.setId("9999");
        dept.setDeptName("洪勇王小康");
        this.deptRepository.updateByPrimaryKeySelective(dept);
    }
    void deleteDept(){
        Dept dept = new Dept();


    }
}