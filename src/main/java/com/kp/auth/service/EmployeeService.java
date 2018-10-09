package com.kp.auth.service;

import com.kp.auth.model.Employee;
import com.kp.auth.model.Employees;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class EmployeeService {

    private static final Map<Integer, Employee> empMap = new HashMap<Integer, Employee>();
    static Employees list;

    static {
        initEmps();
    }

    private static void initEmps() {
        Employee emp1 = new Employee(1, "Smith", 1000);
        Employee emp2 = new Employee(2, "Allen", 3000);
        Employee emp3 = new Employee(3, "Jones", 5000);

        empMap.put(emp1.getId(), emp1);
        empMap.put(emp2.getId(), emp2);
        empMap.put(emp3.getId(), emp3);
    }

    public static Employee getEmployee(int id) {
        return empMap.get(id);
    }

    public static Employee addEmployee(Employee emp) {
        empMap.put(emp.getId(), emp);
        return emp;
    }

    public static Employee updateEmployee(Employee emp) {
        empMap.put(emp.getId(), emp);
        return emp;
    }

    public static void deleteEmployee(int id) {
        empMap.remove(id);
    }

    public static Employees getAllEmployees() {
        list = new Employees();
        list.setList(empMap.values().stream().collect(Collectors.toList()));
        return list;

    }
}
