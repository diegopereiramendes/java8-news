package java8news.interfaces.staticmethod;

public class Car implements VehicleStatic {

    public static void main(String[] args) {
        System.out.println(VehicleStatic.getHorsePower(2500, 480));
    }
}
