package java8news.interfaces.functional;

import java8news.interfaces.model.Employee;

import java.util.List;
import java.util.function.Consumer;

public class InterfaceConsumer {

    public static void main(String[] args) {

        Consumer<Employee> consumer = i -> System.out.println(" " + i.getName());
        List<Employee> employees = Employee.mockEmployees();
        printList(employees, consumer);
    }

    private static void printList(List<Employee> employees, Consumer<Employee> consumer) {
        for (Employee employee : employees) {
            consumer.accept(employee);
        }
    }

}
