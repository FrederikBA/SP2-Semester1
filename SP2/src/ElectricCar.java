public class ElectricCar extends Car {
    private int batteryCapacity;
    private int maxKm;
    private int whPrKm;

    public ElectricCar(int regNr, String brand, String model, int year, int numberOfDoors, int batteryCapacity, int maxKm, int whPrKm) {
        super(regNr, brand, model, year, numberOfDoors);
        this.batteryCapacity = batteryCapacity;
        this.maxKm = maxKm;
        this.whPrKm = whPrKm;
    }

    protected double calculateGreenTax() {
        return 0;
    }

    public int getBatteryCapacity() {
        return batteryCapacity;
    }

    public int getMaxKm() {
        return maxKm;
    }

    public int getWhPrKm() {
        return whPrKm;
    }

    public void setBatteryCapacity(int batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    public void setMaxKm(int maxKm) {
        this.maxKm = maxKm;
    }

    public void setWhPrKm(int whPrKm) {
        this.whPrKm = whPrKm;
    }

    @Override
    public String toString() {
        return "ElectricCar{" +
                "batteryCapacity=" + batteryCapacity +
                ", maxKm=" + maxKm +
                ", whPrKm=" + whPrKm +
                '}';
    }
}
