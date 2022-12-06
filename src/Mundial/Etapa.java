package Mundial;

import java.util.ArrayList;

public class Etapa {

    private String infoEtapa;
    private ArrayList<Partido> listaDepartidos;

    private ArrayList<Equipo> equiposQueAvanzan;

    //Metodo Constructor EtapaMundial

    Etapa(){
        this.listaDepartidos = new ArrayList<Partido>();
        this.equiposQueAvanzan = new ArrayList<Equipo>();
    }



    public String getInfoEtapa() {
        return infoEtapa;
    }

    public void setInfoEtapa(String infoEtapa) {
        this.infoEtapa = infoEtapa;
    }



    public ArrayList<Partido> getListaDepartidos() {
        return listaDepartidos;
    }


    public ArrayList<Equipo> getEquiposQueAvanzan() {
        return equiposQueAvanzan;
    }

    public void setEquiposQueAvanzan(ArrayList<Equipo> equiposQueAvanzan) {
        this.equiposQueAvanzan = equiposQueAvanzan;
    }

}
