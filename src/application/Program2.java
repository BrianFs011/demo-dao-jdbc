package application;

import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		
		System.out.println("=== Test 1 Insart ===");
		Department newDepartment = new Department(null, "GTA");
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
		
		System.out.println("\n=== Test 4 Delete ===");
		System.out.print("Enter Id: ");
		int id = sc.nextInt();
		departmentDao.deleteById(id);
		System.out.println("Deleted");
		
		System.out.println("\n=== Test 5 FindAll ===");
		System.out.println(departmentDao.findAll());
		
		sc.close();
	}
}
