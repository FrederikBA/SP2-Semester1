public class DieselCar extends Car {
    private boolean hasParticleFilter;
    private int kmPrL;

    public DieselCar(String regNr, String brand, String model, int year, int numberOfDoors, boolean hasParticleFilter, int kmPrL) {
        super(regNr, brand, model, year, numberOfDoors);
        this.hasParticleFilter = hasParticleFilter;
        this.kmPrL = kmPrL;
    }

    protected double calculateGreenTax() {
        if (kmPrL >= 20 && kmPrL < 50 && !hasParticleFilter) {
            return 330 + 130 + 1000;
        } else if (kmPrL >= 15 && kmPrL < 20 && !hasParticleFilter) {
            return 1050 + 1390 + 1000;
        } else if (kmPrL >= 10 && kmPrL < 15 && !hasParticleFilter) {
            return 2340 + 1850 + 1000;
        } else if (kmPrL >= 5 && kmPrL < 10 && !hasParticleFilter) {
            return 5500 + 2770 + 1000;
        } else if (kmPrL < 5 && !hasParticleFilter) {
            return 10470 + 15260 + 1000;
        }


        if (kmPrL >= 20 && kmPrL < 50) {
            return 330 + 130;
        } else if (kmPrL >= 15 && kmPrL < 20) {
            return 1050 + 1390;
        } else if (kmPrL >= 10 && kmPrL < 15) {
            return 2340 + 1850;
        } else if (kmPrL >= 5 && kmPrL < 10) {
            return 5500 + 2770;
        } else if (kmPrL < 5) ;
        {
            return 10470 + 15260;
        }
    }

    public boolean getHasParticleFilter() {
        return hasParticleFilter;
    }

    public int getKmPrL() {
        return kmPrL;
    }

    public void setHasParticleFilter(boolean hasParticleFilter) {
        this.hasParticleFilter = hasParticleFilter;
    }

    public void setKmPrL(int kmPrL) {
        this.kmPrL = kmPrL;
    }

    @Override
    public String toString() {
        return "Diesel, " + "RegNr: " + getRegNr() + ", Brand: " + getBrand() + ", Model: " + getModel() + ", " + getYear() + ", Number of Doors: " + getNumberOfDoors() + ", Particle filter: " + getHasParticleFilter() + ", KM per liter " + getKmPrL() + "km/l";
    }
}
