import net.kuba.car_factory.Factory;
import net.kuba.cars.personal.Fiat.Fiat;
import net.kuba.cars.personal.Fiat.FiatInstruction;
import net.kuba.cars.personal.Personal;
import net.kuba.cars.personal.Volvo.Volvo;
import net.kuba.cars.personal.Volvo.VolvoInstruction;
import net.kuba.serializer.Serializer;
import net.kuba.cars.Car;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Serializer serializer = new Serializer();
        Factory factory = new Factory();

        List<Car> cars = new ArrayList<>();

        factory.addInstruction(new FiatInstruction());
        factory.addInstruction(new VolvoInstruction());

        cars.add(factory.getCarByName("Volvo"));
        cars.add(factory.getCarByName("Fiat"));



        for (Car car: cars) {
            try {
                System.out.println(car.getHorse_power() + " " + car.getDoor_count());
                if(car instanceof Personal) {
                    Personal personal = ((Personal) car);
                    System.out.println(personal.getHasIsoFix());
                    if(personal instanceof Volvo) {
                        Volvo volvo = ((Volvo) personal);
                        System.out.println(volvo.getHeatedSeats());
                    } else if (personal instanceof Fiat) {
                        Fiat fiat = ((Fiat) personal);
                        System.out.println(fiat.getIsStolen());
                    }
                }
            } catch (NullPointerException error) {
                System.out.println("Instance of " + car + " in not an car");
            }
        }

        serializer.serialize("cars.dat", cars);
    }
}