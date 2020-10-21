import java.util.ArrayList;

public class Garage {
    ArrayList<Car> cars = new ArrayList<Car>();

    public void addCar(Car car) {

        cars.add(car);

    }

    protected double calculateGreenTaxForParkedCars() {
        return 0;
    }

    public String toString() {
        String result = "";

        for (Car i : cars) {

            result += "\n" + i;

        }

        return result;

    }
    
}
