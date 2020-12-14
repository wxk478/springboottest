package com.wxk.controller;

import com.wxk.repository.DeptRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author 478
 * @data 2020/10/31 - 11:05
 */
@Component
public class BaseHandler {
    @Autowired
    DeptRepository deptRepository;
}
