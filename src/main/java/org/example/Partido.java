package org.example;

public class Partido extends Equipo {

    Equipo equipo1;
    Equipo equipo2;

    private int golesEquipo1 = 0;
    private int golesEquipo2 = 0;

    //Constructor
    public Partido(String NOMBRE, String DESCRIPCION, Equipo equipo1, Equipo equipo2) {
        super(NOMBRE, DESCRIPCION);
        this.equipo1 = equipo1;
        this.equipo2 = equipo2;

    }//getters
    public Equipo getEquipo1() {
        return equipo1;
    }

    public Equipo getEquipo2() {
        return equipo2;
    }

    public int getGolesEquipo1() {
        return golesEquipo1;
    }

    public int getGolesEquipo2() {
        return golesEquipo2;
    }
}
