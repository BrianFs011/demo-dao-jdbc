package application;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		
		System.out.println("=== Test 1 Insart ===");
		Department newDepartment = new Department(null, "Carro");
		departmentDao.insert(newDepartment);
		System.out.println("Insart Department: "+ newDepartment.getId());
		
		System.out.println("\n=== Test 2 FindById ===");
		Department department = departmentDao.findById(3);
		System.out.println(department);

		System.out.println("\n=== Test 3 Update ===");
		department = departmentDao.findById(2);
		department.setName("avião");
		departmentDao.upDate(department);
		System.out.println("UpDate completed");
		
	}
}
