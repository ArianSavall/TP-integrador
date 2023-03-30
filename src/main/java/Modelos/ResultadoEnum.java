package Modelos;

import com.opencsv.bean.CsvBindByPosition;

public class ResultadoEnum {

    @CsvBindByPosition(position = 0)
    private String Equipo1;
    @CsvBindByPosition(position = 1)
    private String Cantgoles1;
    @CsvBindByPosition(position = 2)
    private String Cantgoles2;
    @CsvBindByPosition(position = 3)
    private String Equipo2;
    //    private ResultadoEnum ganador;
//    private ResultadoEnum perdedor;
//    private ResultadoEnum empate;

//    protected int puntaje = 0;

    public ResultadoEnum(String equipo1, String cantgoles1, String cantgoles2, String equipo2) {
        Equipo1 = equipo1;
        Cantgoles1 = cantgoles1;
        Cantgoles2 = cantgoles2;
        Equipo2 = equipo2;
    }

    public ResultadoEnum() {
    }

    public String getEquipo1() {return Equipo1;}

    public void setEquipo1(String equipo1) {Equipo1 = equipo1;}

    public String getCantgoles1() {return Cantgoles1;}

    public void setCantgoles1(String cantgoles1) {Cantgoles1 = cantgoles1;}

    public String getCantgoles2() {return Cantgoles2;}

    public void setCantgoles2(String cantgoles2) {Cantgoles2 = cantgoles2;}

    public String getEquipo2() {return Equipo2;}

    public void setEquipo2(String equipo2) {Equipo2 = equipo2;}


public void imprimirResultados (ResultadoEnum resultados){

    System.out.printf("%-20s %-20s %-20s %-20s %n", resultados.getEquipo1(), resultados.getCantgoles1(), resultados.getCantgoles2(), resultados.getEquipo2());
}
}
