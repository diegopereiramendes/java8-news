package interfaces.functional;

import interfaces.model.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class InterfacePredicate {

    public static void main(String[] args) {

        Predicate<Employee> positive = i -> i.getIdade() > 0;
        List<Employee> employees = Employee.mockEmployees();
        List<Employee> employeesFiltered = filterList(employees, positive);
        employeesFiltered.forEach(System.out::println);
    }

    private static List<Employee> filterList(List<Employee> employees, Predicate<Employee> predicate) {
        List<Employee> filteredList = new ArrayList<>();
        for (Employee employee : employees) {
            if (predicate.test(employee)) {
                filteredList.add(employee);
            }
        }
        return filteredList;
    }

}
