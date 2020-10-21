import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        GasolineCar gasolinecar = new GasolineCar(1050,"Audi","A8",2020,4,25,9);
        ElectricCar electriccar = new ElectricCar(1050,"Tesla","S",2018,4,70,249,250);
        DieselCar dieselcar = new DieselCar (1050,"Citroen","C4",2012,4,true,16);

        System.out.println(gasolinecar.calculateGreenTax());
        System.out.println(electriccar.calculateGreenTax());
        System.out.println(dieselcar.calculateGreenTax());
    }
}
