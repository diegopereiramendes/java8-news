package interfaces.functional;

import interfaces.model.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class InterfaceFunction {

    public static void main(String[] args) {

        Function<Employee, String> funcEmpToString = (Employee e) -> e.getName();
        List<Employee> employeeList = Employee.mockEmployees();
        List<String> empNameList = convertEmpListToNamesList(employeeList, funcEmpToString);
        empNameList.forEach(System.out::println);
    }

    private static List<String> convertEmpListToNamesList(List<Employee> employeeList, Function<Employee, String> funcEmpToString) {
        List<String> empNameList = new ArrayList<>();
        for (Employee emp : employeeList) {
            empNameList.add(funcEmpToString.apply(emp));
        }
        return empNameList;
    }


}