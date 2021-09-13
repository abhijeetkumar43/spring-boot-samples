package com.practice.learning.department.dao;

import com.practice.learning.department.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends JpaRepository<Department,Long> {
    Department findByDepartmentId(Long id);
    //void save(Department department);
    //void addDepartment(Department department);
}
