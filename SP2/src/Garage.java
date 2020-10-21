import java.util.ArrayList;

public class Garage {
    private ArrayList <Car> cars;

    public Garage(ArrayList<Car> cars) {
        this.cars = cars;
    }

    private void calculateGreenTaxForParkedCars() {

    }

    public ArrayList<Car> getCars() {
        return cars;
    }

    public void setCars(ArrayList<Car> cars) {
        this.cars = cars;
    }
}
