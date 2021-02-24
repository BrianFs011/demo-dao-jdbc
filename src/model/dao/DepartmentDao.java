package model.dao;

import java.util.List;

import model.entities.Department;

public interface DepartmentDao {

	void insert(Department obj);
	void upDate(Department obj);
	void deleteById(Integer Id);
	Department findById(Integer Id);
	List<Department>findAll();
}
