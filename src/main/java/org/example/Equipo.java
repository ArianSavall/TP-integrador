package org.example;

public class Equipo {

    private String NOMBRE;
    private String DESCRIPCION;

    public Equipo(String NOMBRE, String DESCRIPCION) {
        this.NOMBRE = NOMBRE;
        this.DESCRIPCION = DESCRIPCION;
    }

    public String getNOMBRE() {
        return NOMBRE;
    }

    public String getDESCRIPCION() {
        return DESCRIPCION;
    }
}
