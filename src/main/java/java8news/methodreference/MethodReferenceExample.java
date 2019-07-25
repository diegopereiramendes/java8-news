package java8news.methodreference;

import java.util.Arrays;
import java.util.List;

public class MethodReferenceExample {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(12, 5, 45, 18, 33, 24, 40);
        list.stream().forEach(MethodReferenceExample::sum);
    }

    public static Integer sum(Integer value) {
        int sum = value + 10;
        System.out.println(sum);
        return sum;
    }
}
