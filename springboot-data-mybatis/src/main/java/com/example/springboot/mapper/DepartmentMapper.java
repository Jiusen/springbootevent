package com.example.springboot.mapper;

import com.example.springboot.bean.Department;
import org.apache.ibatis.annotations.*;

/**
 * @Author Jiusen Guo
 * @Date 2020/10/14 11:19
 * @Version 1.0
 */

//指定这是一个操作数据库的mapper
//@Mapper
public interface DepartmentMapper {

    @Select("select * from department where id=#{id}")
    public Department getDeptById(Integer id);

    @Delete("delete from department where id=#{id}")
    public int deleteDept(Department department);

    @Options(useGeneratedKeys = true, keyProperty = "id")
    @Insert("insert into department(department_name) values(#{departmentName})")
    public int insertDept(Department department);

    @Update("update department set department_name=#{departmentName} where id=#{id}")
    public int updateDept(Department department);
}
