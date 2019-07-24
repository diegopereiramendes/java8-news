package java8news.interfaces.model;

import java.util.Arrays;
import java.util.List;

public class Employee {

    private String name;
    private Integer idade;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public Employee(String name, Integer idade) {
        this.name = name;
        this.idade = idade;
    }

    public static List<Employee> mockEmployees() {
        return Arrays.asList(new Employee("Tom Jones", 45),
                new Employee("Harry Major", 25),
                new Employee("Ethan Hardy", 65),
                new Employee("Nancy Smith", 15),
                new Employee("Deborah Sprightly", 29),
                new Employee("Antonio", 29),
                new Employee("Antonio", 29),
                new Employee("Diego Negativo", -10));

    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                '}';
    }
}
