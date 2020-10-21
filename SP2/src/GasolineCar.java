public class GasolineCar extends Car {
    private int octaneNumber;
    private int kmPrL;

    public GasolineCar(String regNr, String brand, String model, int year, int numberOfDoors, int octaneNumber, int kmPrL) {
        super(regNr, brand, model, year, numberOfDoors);
        this.octaneNumber = octaneNumber;
        this.kmPrL = kmPrL;
    }

    protected double calculateGreenTax() {
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

    public int getOctaneNumber() {
        return octaneNumber;
    }

    public int getKmPrL() {
        return kmPrL;
    }

    public void setOctaneNumber(int octaneNumber) {
        this.octaneNumber = octaneNumber;
    }

    public void setKmPrL(int kmPrL) {
        this.kmPrL = kmPrL;
    }

    @Override
    public String toString() {
        return "Price: " + calculateGreenTax() + ",- " + getBrand() + " " + getModel() + ", Gasoline, RegNr: " + getRegNr() + ", Year: " + getYear() + ", Doors: " + getNumberOfDoors() + ", Octane Number: " + getOctaneNumber() + ", Consumption: " + getKmPrL() + "km/l";
    }
}
