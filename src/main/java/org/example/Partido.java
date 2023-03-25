package org.example;

public class Partido extends Equipo {

    private Equipo equipo1;
    private Equipo equipo2;

    private int golesEquipo1 = 0;
    private int golesEquipo2 = 0;


    //Constructor
    public Partido(String NOMBRE, String DESCRIPCION, Equipo equipo1, Equipo equipo2) {
        super(NOMBRE, DESCRIPCION);
        this.equipo1 = equipo1;
        this.equipo2 = equipo2;

    }
}
