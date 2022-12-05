package Garaje;

public class Auto extends Vehiculo {
    private int cantPuertas;

    Auto(String marca, String modelo, int kilometros, int cantRueda, int cantPuertas){
        this.setCantRueda(cantRueda);
        this.setMarca(marca);
        this.setModelo(modelo);
        this.setCantPuertas(cantPuertas);
        this.setKilometros(kilometros);

    }

    public int getCantPuertas() {
        return cantPuertas;
    }

    public void setCantPuertas(int cantPuertas) {
        this.cantPuertas = cantPuertas;
    }


}
