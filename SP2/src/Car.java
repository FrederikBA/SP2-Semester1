public abstract class Car {
    private String regNr;
    private String brand;
    private String model;
    private int year;


    private int numberOfDoors;

    public Car(String regNr, String brand, String model, int year, int numberOfDoors) {
        this.regNr = regNr;
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.numberOfDoors = numberOfDoors;
    }


    protected double calculateGreenTax() {
        return 0;
    }

    public String getRegNr() {
        return regNr;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setRegNr(String regNr) {
        this.regNr = regNr;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }
}


