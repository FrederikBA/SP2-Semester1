import java.util.ArrayList;

public class Garage {
    ArrayList<Car> cars = new ArrayList<Car>();

    public void addCar(Car car) {

        cars.add(car);

    }

    protected double calculateGreenTaxForParkedCars() {
        double sum = 0;

        for (Car car : cars) {
            sum += car.calculateGreenTax();
        }

        return sum;
    }

    public String toString() {
        String result = "";

        for (Car i : cars) {

            result += "\n" + i;

        }

        return result;

    }

}
