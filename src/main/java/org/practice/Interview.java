package org.practice;


import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Interview {

    static class Employee {
        public Employee(String name, int salary) {
            this.name = name;
            this.salary = salary;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getSalary() {
            return salary;
        }

        public void setSalary(int salary) {
            this.salary = salary;
        }

        String name;

        public Employee(String name, int salary, String department) {
            this.name = name;
            this.salary = salary;
            this.department = department;
        }

        int salary;

        public String getDepartment() {
            return department;
        }

        public void setDepartment(String department) {
            this.department = department;
        }

        String department;

        // constructor, getters
    }


    public static void main(String[] args) {

        List<Employee> employees = List.of(
                new Employee("A", 5000),
                new Employee("B", 7000),
                new Employee("C", 6000),
                new Employee("C", 16000)
        );

        int asInt = employees.stream().mapToInt(Employee::getSalary).max().getAsInt();
        System.out.println(asInt);

        String str = "banana";

        Map<String, Long> collect = Arrays.stream(str.split(""))
                .collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new ,Collectors.counting()));
        System.out.println(collect);

        Map<Character, Long> collect1 = str.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new, Collectors.counting()));
        System.out.println(collect1);


        List<Employee> employeesD = List.of(
                new Employee("A", 5000,"IT"),
                new Employee("B", 7000,"HR"),
                new Employee("C", 6000,"QA"),
                new Employee("C", 16000,"IT")
        );

        Map<String, Optional<Employee>> collect2 = employeesD.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment, LinkedHashMap::new,Collectors.maxBy(Comparator.comparingInt(Employee::getSalary))));
        System.out.println(collect2);

    }
}
