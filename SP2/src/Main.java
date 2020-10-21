public class Main {
    public static void main(String[] args) {
        GasolineCar gasolinecar = new GasolineCar(1050,"Audi","A8",2020,4,25,46);
        ElectricCar electriccar = new ElectricCar(1050,"Tesla","S",2018,4,70,249,250);
        System.out.println(gasolinecar.calculateGreenTax());
        System.out.println(electriccar.calculateGreenTax());
    }
}
