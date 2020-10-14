package com.example.springboot.controller;

import com.example.springboot.bean.Department;
import com.example.springboot.bean.Employee;
import com.example.springboot.mapper.DepartmentMapper;
import com.example.springboot.mapper.EmployeeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author Jiusen Guo
 * @Date 2020/10/14 11:28
 * @Version 1.0
 */
//@RestController返回return信息，@Controller返回模板页面
@RestController
public class DeptController {

    @ResponseBody
    @GetMapping("/hello")
    public String hello(){
        return "hello";
    }

    @Autowired
    DepartmentMapper departmentMapper;

    @Autowired
    EmployeeMapper employeeMapper;

    @GetMapping("/dept/{id}")
    public Department getDepartment(@PathVariable("id") Integer id){
        return departmentMapper.getDeptById(id);
    }

    @GetMapping("/dept")
    public Department insertDept(Department department){
        departmentMapper.insertDept(department);
        return department;
    }

    @GetMapping("/emp/{id}")
    public Employee getEmp(@PathVariable Integer id){
        return employeeMapper.getEmpById(id);
    }
}
