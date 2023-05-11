import net.kuba.cars.Car;
import net.kuba.serializer.Serializer;
import java.util.List;

public class Deserializer {
    public static void main(String[] args) {
        Serializer serializer = new Serializer();

        List<Car> cars = serializer.deserialize("cars.dat");

        for (Car car: cars) {
            System.out.println(car.getHorse_power() + " " + car.getDoor_count());
        }
    }
}