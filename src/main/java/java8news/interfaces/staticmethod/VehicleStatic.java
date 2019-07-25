package java8news.interfaces.staticmethod;

public interface VehicleStatic {

    static int getHorsePower(int rpm, int torque) {
        return (rpm * torque) / 5252;
    }
}
