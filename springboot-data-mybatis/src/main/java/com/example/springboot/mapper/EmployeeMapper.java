package com.example.springboot.mapper;

import com.example.springboot.bean.Employee;

/**
 * @Author Jiusen Guo
 * @Date 2020/10/14 14:20
 * @Version 1.0
 */
//@Mapper或者@MapperScan将接口扫描装配到容器中
public interface EmployeeMapper {

    public Employee getEmpById(Integer id);

    public void insertEmp(Employee employee);
}
