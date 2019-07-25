package java8news.stringjoiner;

import java.util.StringJoiner;

public class StringJoinerExampleWithPrefixSuffix {

    public static void main(String[] args) {
        StringJoiner joinNames = new StringJoiner(",", "[", "]");   // passing comma(,) and square-brackets as delimiter

        // Adding values to StringJoiner
        joinNames.add("Diego");
        joinNames.add("Tiago");
        joinNames.add("Lucas");
        joinNames.add("Mateus");

        System.out.println(joinNames);
    }
}
