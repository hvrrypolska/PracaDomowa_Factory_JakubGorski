package net.kuba.cars.personal.Volvo;

import net.kuba.cars.Car;
import net.kuba.cars.CarInstruction;

public class VolvoInstruction implements CarInstruction {
    @Override
    public String getCarName() {
        return "Volvo";
    }

    @Override
    public String getCarsName() {
        return null;
    }

    @Override
    public Car getNewInstance() {
        return new Volvo(90,5,false);
    }
}