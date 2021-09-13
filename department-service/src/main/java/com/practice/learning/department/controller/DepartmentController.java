package com.practice.learning.department.controller;

import com.practice.learning.department.entity.Department;
import com.practice.learning.department.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/department")
public class DepartmentController {
    @Autowired
    private DepartmentService departmentService;
    @GetMapping("/{id}")
    public Department getDepartmentById(@PathVariable Long id){
        return departmentService.getDepartmentById(id);
    }
    @PostMapping("/")
    public void addDepartment(@RequestBody Department department){
        departmentService.addDepartment(department);
    }
}
