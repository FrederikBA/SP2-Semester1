import java.util.ArrayList;
import java.util.Collection;

public class Garage {
    ArrayList<Car> cars = new ArrayList<Car>();

    public void addCar(Car car) {

        cars.add(car);

    }

    public void calculateGreenTaxForParkedCars() {

    }

    public String toString() {
        String result = "";

        for (Car i : cars) {

            result += "\n" + i;

        }

        return result;

    }


}
