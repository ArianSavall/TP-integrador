package Modelos;

public class Ronda extends Partido{
    private String nro;
    private Partido[] partidos;

    public Ronda(String NOMBRE, String DESCRIPCION, Equipo equipo1, Equipo equipo2) {
        super(NOMBRE, DESCRIPCION, equipo1, equipo2);
    }


}
