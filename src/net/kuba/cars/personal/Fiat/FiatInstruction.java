package net.kuba.cars.personal.Fiat;

import net.kuba.cars.Car;
import net.kuba.cars.CarInstruction;

public class FiatInstruction implements CarInstruction {
    @Override
    public String getCarName() {
        return "Fiat";
    }

    @Override
    public String getCarsName() {
        return null;
    }

    @Override
    public Car getNewInstance() {
        return new Fiat(85,3,true);
    }
}