package com.wxk.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.wxk.entity.Dept;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author 478
 * @data 2020/10/31 - 11:04
 */
@RestController
@RequestMapping("/dept")
@CrossOrigin
public class DeptHandler extends BaseHandler{

    @GetMapping("/findAll/{page}/{size}")
    public PageInfo<Dept> findAll(@PathVariable("page")Integer page, @PathVariable("size")Integer size){
        PageHelper.startPage(page,size);
        List<Dept> depts = this.deptRepository.selectAll();
        PageInfo<Dept> deptPageInfo  = new PageInfo<>(depts);
        return deptPageInfo;
    }

    @GetMapping("/findAll")
    public List<Dept> findAll1(){
        List<Dept> depts = this.deptRepository.selectAll();
        return depts;
    }

    @PostMapping("/save")
    public  String saveDept(@RequestBody Dept dept){
        int i = this.deptRepository.insertSelective(dept);
        if (i != 0){
            return "Success";
        }else {
            return "Error";
        }
    }

    @PostMapping("/updateDept")
    public String updateDept(@RequestBody Dept dept){
        int result = this.deptRepository.updateByPrimaryKeySelective(dept);
        if (result != 0) {
            return "Success";
        }else {
            return "Error";
        }
    }

    @PostMapping("/del/{id}")
    public String deleteDept(@PathVariable(name = "id")Integer id){
        String id1 = String.valueOf(id);
        int reslt = this.deptRepository.deleteByPrimaryKey(id1);
        if (reslt != 0) {
            return "Success";
        }else {
            return "Error";
        }
    }

}
