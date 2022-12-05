public class Moto extends Vehiculo {
    public int cilindrada;

    Moto(String marca, String modelo, int cantRueda, int cilindrada){
        this.setCantRueda(cantRueda);
        this.setMarca(marca);
        this.setModelo(modelo);
        this.setCilindrada(cilindrada);
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

}
