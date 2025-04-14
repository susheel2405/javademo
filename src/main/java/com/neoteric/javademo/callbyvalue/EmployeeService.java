package com.neoteric.javademo.callbyvalue;

public class EmployeeService {


    public static void main(String[] args) {
        Employee employee = new Employee("Susheel");
    }



}







//public static void main(String[] args) {
////
////        Employee emp1 = new Employee(12345, "Venkat reddy");
////        System.out.println("Before method call:");
////        emp1.display();
////
////        modifyEmployee(emp1);
////
////        System.out.println("After method call:");
////        emp1.display();
////
////    }
////
////
////            public static void modifyEmployee(Employee emp) {
////                emp.name = "Modified Name";
////                emp.id = 999;
////
////                emp = new Employee(1234, "Susheel reddy");
////                System.out.println("Inside method (after reassign):");
////                emp.display();
////            }
////
////
////


