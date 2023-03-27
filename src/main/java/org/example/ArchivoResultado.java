package org.example;

import com.opencsv.bean.CsvBindByPosition;

public class ArchivoResultado {
    @CsvBindByPosition(position = 0)
    private String equipo1;
    @CsvBindByPosition(position = 1)
    private Integer cantgoles1;
    @CsvBindByPosition(position = 2)
    private Integer cantgoles2;
    @CsvBindByPosition(position = 3)
    private String equipo2;

    public String getEquipo1() {return equipo1;}
    public Integer getCantgoles1() {return cantgoles1;}
    public Integer getCantgoles2() {return cantgoles2;}
    public String getEquipo2() {return equipo2;}

    public void setEquipo1(String equipo1) {this.equipo1 = equipo1;}
    public void setCantgoles1(Integer cantgoles1) {this.cantgoles1 = cantgoles1;}
    public void setCantgoles2(Integer cantgoles2) {this.cantgoles2 = cantgoles2;}
    public void setEquipo2(String equipo2) {this.equipo2 = equipo2;}
}
