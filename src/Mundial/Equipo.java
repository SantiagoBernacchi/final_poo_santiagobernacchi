package Mundial;

import java.util.ArrayList;

public class Equipo {

    private String nombre;
    private ArrayList<Partido> partidosJugados;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Equipo(String nombre) {
        this.setNombre(nombre);
    }
}
