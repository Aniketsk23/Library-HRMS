package com.department.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.department.entity.DepartmentEntity;


@Repository
public interface DepartmentRepository extends JpaRepository <DepartmentEntity, Long> {

	DepartmentEntity findByDepartmentId(Long departmentId);

}
