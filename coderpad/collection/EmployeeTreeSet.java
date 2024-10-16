package gs.coderpad.collection;

import java.util.Set;
import java.util.TreeSet;

class Employee implements Comparable<Employee>{
    private int empId;
    private String name;
    private double salary;

    public Employee(int empId, String name, double salary){
        this.empId=empId;
        this.name=name;
        this.salary=salary;
    }

    @Override
    public int compareTo(Employee o) {
        return Integer.compare(this.empId, o.empId);
    }
}
class EmployeeTreeSet{
    public static void main(String[] args) {
        Set<Employee> employees=new TreeSet<Employee>();
        employees.add(new Employee(1,"Moushmi",70000));
        employees.add(new Employee(2,"Rani",80000));
        System.out.println(employees.size());
    }
}
