package java8news.reflection;

import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.util.Arrays;

public class Reflection {

    public static void main(String[] args) {
        Calculate calculate = new Calculate();
        Class cls = calculate.getClass();
        Method[] methods = cls.getDeclaredMethods();
        Arrays.stream(methods).forEach(method -> {
            System.out.println(method.getName());
            Parameter[] parameters = method.getParameters(); // It returns array of parameters
            Arrays.stream(parameters).forEach(parameter -> {
                System.out.print(" " + parameter.getParameterizedType()); // returns type of parameter
                System.out.print(" " + parameter.getName()); // returns parameter name
            });
            System.out.println(" ");
        });
    }
}
