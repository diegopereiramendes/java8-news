package java8news.interfaces.functional;

import java.util.Date;
import java.util.function.Supplier;

public class InterfaceSupplier {

    public static void main(String[] args) {

        Supplier<String> helloStrSupplier = () -> new String("Hello");
        String helloStr = helloStrSupplier.get();
        System.out.println("String in helloStr is->" + helloStr + "<-");

        Supplier<String> emptyStrSupplier = String::new;
        String emptyStr = emptyStrSupplier.get();
        System.out.println("String in emptyStr is->" + emptyStr + "<-");

        Supplier<Date> dateSupplier = InterfaceSupplier::getSystemDate;
        Date systemDate = dateSupplier.get();
        System.out.println("systemDate->" + systemDate);
    }

    private static Date getSystemDate() {
        return new Date();
    }
}
