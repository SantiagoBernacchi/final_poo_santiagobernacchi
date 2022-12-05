package Garaje;

import java.util.ArrayList;

public class Garaje {
    private double precioTotal;
    private boolean estaLleno;
    private double precioRueda;
    private int capacidadMax;
    private Vehiculo transporte;
    private ArrayList<Vehiculo>vehiculo;
    private double kilometrajeMedio;


    public boolean estaLleno(){
        return this.vehiculo.size()>capacidadMax;
    }
    public void agregarVehiculo(Vehiculo vehiculo){
        if (estaLleno);
        else
            this.vehiculo.add(vehiculo);
    }
    public void egresoVehiculo (Vehiculo vehiculo){
        this.vehiculo.remove(vehiculo);
    }
    public Garaje(int capacidadMax, double precioRueda){
        this.setCapacidadMax(capacidadMax);
        this.setPrecioRueda(precioRueda);
        this.vehiculo=new ArrayList<Vehiculo>();
    }

    public double getPrecioTotal() {
        return precioTotal;
    }

    public void setPrecioTotal(double precioTotal) {
        this.precioTotal = precioTotal;
    }

    public boolean isEstaLleno() {
        return estaLleno;
    }

    public void setEstaLleno(boolean estaLleno) {
        this.estaLleno = estaLleno;
    }

    public double getPrecioRueda() {
        return precioRueda;
    }

    public void setPrecioRueda(double precioRueda) {
        this.precioRueda = precioRueda;
    }

    public int getCapacidadMax() {
        return capacidadMax;
    }

    public void setCapacidadMax(int capacidadMax) {
        this.capacidadMax = capacidadMax;
    }

    public Vehiculo getTransporte() {
        return transporte;
    }

    public void setTransporte(Vehiculo transporte) {
        this.transporte = transporte;
    }

    public ArrayList<Vehiculo> getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(ArrayList<Vehiculo> vehiculo) {
        this.vehiculo = vehiculo;
    }

    public double getKilometrajeMedio() {
        return kilometrajeMedio;
    }

    public void setKilometrajeMedio(double kilometrajeMedio) {
        this.kilometrajeMedio = kilometrajeMedio;
    }
}
