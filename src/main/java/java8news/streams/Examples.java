package java8news.streams;

import java8news.interfaces.model.Employee;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Examples {

    public static void main(String[] args) {

        createStreamSimple();
        createStreamFromList();
        createStreamFromChars();
        convertStreamToCollections();
        convertStreamToArray();
        convertStreamToMap();
        streamGrouping();
        streamFilter();
        streamMap();
        streamSorted();
        streamMatch();
        streamCount();
        streamMerge();
    }

    private static void createStreamSimple() {
        Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
        stream.forEach(System.out::println);
    }

    private static void createStreamFromList() {
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i < 10; i++) {
            list.add(i);
        }
        Stream<Integer> stream = list.stream();
        stream.forEach(p -> System.out.println(p));
    }

    private static void createStreamFromChars() {
        IntStream stream = "12345_abcdefg".chars();
        stream.forEach(p -> System.out.println(p));
    }

    private static void convertStreamToCollections() {
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i < 10; i++) {
            list.add(i);
        }
        Stream<Integer> stream = list.stream();
        List<Integer> evenNumbersList = stream.filter(i -> i % 2 == 0).collect(Collectors.toList());
        System.out.print(evenNumbersList);
    }

    private static void convertStreamToArray() {
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i < 10; i++) {
            list.add(i);
        }
        Stream<Integer> stream = list.stream();
        Integer[] evenNumbersArr = stream.filter(i -> i % 2 == 0).toArray(Integer[]::new);
        System.out.print(evenNumbersArr);
    }

    private static void convertStreamToMap() {
        List<Employee> employees = Employee.mockEmployees();
        Map<String, Employee> employeesMap = employees.stream()
                .collect(Collectors.toMap(Employee::getName,
                        Function.identity()));

        System.out.println(employeesMap);
    }

    private static void streamGrouping() {
        List<Employee> employees = Employee.mockEmployees();
        Map<String, List<Employee>> employeesMap = employees.stream()
                .collect(Collectors.groupingBy(Employee::getName));

        System.out.println(employeesMap);
    }

    private static void streamFilter() {
        List<Employee> employees = Employee.mockEmployees();
        employees.stream().filter((s) -> s.getName().startsWith("A"))
                .forEach(System.out::println);
    }

    private static void streamMap() {
        List<Employee> employees = Employee.mockEmployees();
        employees.stream().filter((s) -> s.getName().startsWith("A"))
                .map(employee -> employee.getName().toUpperCase())
                .forEach(System.out::println);
    }

    private static void streamSorted() {
        List<Employee> employees = Employee.mockEmployees();
        employees.stream().filter((s) -> s.getName().startsWith("A")).sorted(Comparator.comparing(employee -> employee.getName()))
                .map(employee -> employee.getName().toUpperCase())
                .forEach(System.out::println);
    }

    private static void streamMatch() {
        List<Employee> employees = Employee.mockEmployees();
        boolean matchedResult = employees.stream()
                .anyMatch((s) -> s.getName().startsWith("A"));
        System.out.println(matchedResult);
        matchedResult = employees.stream()
                .allMatch((s) -> s.getName().startsWith("A"));
        System.out.println(matchedResult);
        matchedResult = employees.stream()
                .noneMatch((s) -> s.getName().startsWith("A"));
        System.out.println(matchedResult);
    }

    private static void streamCount() {
        List<Employee> employees = Employee.mockEmployees();
        long totalMatched = employees.stream()
                .filter((s) -> s.getName().startsWith("A"))
                .count();
        System.out.println(totalMatched);
    }

    private static void streamMerge() {
        Stream<Integer> firstStream = Stream.of(1, 2, 3);
        Stream<Integer> secondStream = Stream.of(4, 5, 6);
        Stream<Integer> resultingStream = Stream.concat(firstStream, secondStream);
        System.out.println(resultingStream.collect(Collectors.toList()));
    }
}