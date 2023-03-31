package Modelos;

import com.opencsv.bean.CsvBindByPosition;

public class Pronostico {

    @CsvBindByPosition(position = 0)
    private String equipo1;
    @CsvBindByPosition(position = 1)
    private String gana1;
    @CsvBindByPosition(position = 2)
    private String empate;
    @CsvBindByPosition(position = 3)
    private String gana2;
    @CsvBindByPosition(position = 4)
    private String equipo2;


    private Partido partido;
    private Equipo equipo;
    private ResultadoEnum resultado;

    public Pronostico(String equipo1, String gana1, String empate, String gana2, String equipo2) {
        this.equipo1 = equipo1;
        this.gana1 = gana1;
        this.empate = empate;
        this.gana2 = gana2;
        this.equipo2 = equipo2;
    }

    public String getEquipo1() {return equipo1;}

    public String getGana1() {return gana1;}

    public String getEmpate() {return empate;}

    public String getGana2() {return gana2;}

    public String getEquipo2() {return equipo2;}

    public Pronostico() {
    }

    public void imprimirPronostico (Pronostico pronostico){

        System.out.printf("%-20s %-20s %-20s %-20s %-20s %n", pronostico.getEquipo1(), pronostico.getGana1(), pronostico.getEmpate(), pronostico.getGana2(), pronostico.getEquipo2());
    }
}
