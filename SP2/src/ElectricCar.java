public class ElectricCar extends Car {
    private int batteryCapacity;
    private int maxKm;
    private int whPrKm;
    private double kmPrL;
    private double result;


    public ElectricCar(String regNr, String brand, String model, int year, int numberOfDoors, int batteryCapacity, int maxKm, int whPrKm) {
        super(regNr, brand, model, year, numberOfDoors);
        this.batteryCapacity = batteryCapacity;
        this.maxKm = maxKm;
        this.whPrKm = whPrKm;
    }

    protected double calculateGreenTax() {
        result = whPrKm/91.25;
        kmPrL = 100/result;
        if (kmPrL >= 20 && kmPrL < 50) {
            return 330;
        } else if (kmPrL >= 15 && kmPrL < 20) {
            return 1050;
        } else if (kmPrL >= 10 && kmPrL < 15) {
            return 2340;
        } else if (kmPrL >= 5 && kmPrL < 10) {
            return 5500;
        } else if (kmPrL < 5) ;
        {
            return 10470;
        }
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

    public double getKmPrL() {
        return kmPrL;
    }

    public void setKmPrL(double kmPrL) {
        this.kmPrL = kmPrL;
    }

    @Override
    public String toString() {
        return "Electric, " + "RegNr: " + getRegNr() + ", Brand: " + getBrand() + ", Model: " + getModel() + ", " + getYear() + ", Number of Doors: " + getNumberOfDoors() + ", Battery Capacity: " + getBatteryCapacity() + ", Max KM: " + getMaxKm() + ", WH per KM " + getWhPrKm() + "wh/km";
    }
}
