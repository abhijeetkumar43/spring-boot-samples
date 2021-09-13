package com.practice.learning.department.service;

import com.practice.learning.department.dao.DepartmentRepository;
import com.practice.learning.department.entity.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DepartmentService {
    @Autowired
    private DepartmentRepository departmentRepository;
    public Department getDepartmentById(Long id) {
       return departmentRepository.findByDepartmentId(id);
    }

    public void addDepartment(Department department) {
        departmentRepository.save(department);
    }
}
