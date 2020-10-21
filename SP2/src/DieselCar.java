public class DieselCar extends Car {
    private boolean hasParticleFilter;
    private int kmPrL;

    public DieselCar(int regNr, String brand, String model, int year, int numberOfDoors, boolean hasParticleFilter, int kmPrL) {
        super(regNr, brand, model, year, numberOfDoors);
        this.hasParticleFilter = hasParticleFilter;
        this.kmPrL = kmPrL;
    }

    protected double calculateGreenTax() {
        return 0;
    }

    public boolean isHasParticleFilter() {
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
        return "DieselCar{" +
                "hasParticleFilter=" + hasParticleFilter +
                ", kmPrL=" + kmPrL +
                '}';
    }
}
