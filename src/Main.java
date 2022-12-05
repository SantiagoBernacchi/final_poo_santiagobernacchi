import Garaje.Garaje;

public class Main {
    public static void main(String[]args) {
        Garaje garaje1= new Garaje(20, 1500);
        Auto auto1= new Auto("Nissan", "Sentra",25000,4,5);
        Moto moto1= new Moto("Honda","Tornado",2,250);

    garaje1.agregarVehiculo(auto1);
    garaje1.agregarVehiculo(auto1);
    garaje1.agregarVehiculo(auto1);

    System.out.println(String.format(""));
    }
}