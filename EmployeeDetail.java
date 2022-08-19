package day2_objects;

public class EmployeeDetail {
	public static void main(String[]args) {
		Employee employee1 = new Employee();
		employee1.employeeName = "Siva";
		employee1.employeeId = 456;
		employee1.employeeDepartment = "Quality";
		employee1.employeeSalary = 6000;
		Employee employee2 = new Employee();
		employee2.employeeName = "Karthik";
		employee2.employeeId = 457;
		employee2.employeeDepartment = "Quality";
		employee2.employeeSalary = 7000;
		Employee employee3 = new Employee();
		employee3.employeeName = "Venkat";
		employee3.employeeId = 458;
		employee3.employeeDepartment = "Quality";
		employee3.employeeSalary = 8000;
		System.out.println(employee1.employeeName+" "+employee1.employeeId+" "+employee1.employeeDepartment+" "+employee1.employeeSalary);
		System.out.println(employee2.employeeName+" "+employee2.employeeId+" "+employee2.employeeDepartment+" "+employee2.employeeSalary);
		System.out.println(employee3.employeeName+" "+employee3.employeeId+" "+employee3.employeeDepartment+" "+employee3.employeeSalary);
		
	}
	

}
