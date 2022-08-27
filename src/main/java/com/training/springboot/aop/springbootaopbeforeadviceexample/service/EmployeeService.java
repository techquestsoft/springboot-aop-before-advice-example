package com.training.springboot.aop.springbootaopbeforeadviceexample.service;

import org.springframework.stereotype.Service;
import com.training.springboot.aop.springbootaopbeforeadviceexample.model.Employee;
@Service
public class EmployeeService
{
    public Employee createEmployee( String empId, String fname, String sname)
    {
        Employee emp = new Employee();
        emp.setEmpId(empId);
        emp.setFirstName(fname);
        emp.setSecondName(sname);
        return emp;
    }
    public void deleteEmployee(String empId)
    {
    }
}