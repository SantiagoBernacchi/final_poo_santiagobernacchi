package Garaje;

public class Vehiculo {
    private int cantRueda;
    private double kilometros;
    private String marca;
    private String modelo;

    public int getCantRueda() {
        return cantRueda;
    }

    public void setCantRueda(int cantRueda) {
        this.cantRueda = cantRueda;
    }

    public double getKilometros() {
        return kilometros;
    }

    public void setKilometros(double kilometros) {
        this.kilometros = kilometros;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
}
