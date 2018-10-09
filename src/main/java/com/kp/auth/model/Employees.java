package com.kp.auth.model;

import java.util.ArrayList;
import java.util.List;

public class Employees {

    List<Employee> employeeList = new ArrayList<>();

    public List<Employee> getList() {
        return employeeList;
    }

    public void setList(List<Employee> list) {
        this.employeeList = list;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employees)) return false;

        Employees employees = (Employees) o;

        return employeeList != null ? employeeList.equals(employees.employeeList) : employees.employeeList == null;
    }

    @Override
    public int hashCode() {
        return employeeList != null ? employeeList.hashCode() : 0;
    }
}
