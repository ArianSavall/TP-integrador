package org.example;
import com.opencsv.bean.CsvToBeanBuilder;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void main(String[] args) {

//        Equipo equipo1 = new Equipo("Argentina", "Campeon del mundo");
//        System.out.println("hola, soy " +equipo1.getNOMBRE() + " y soy " + equipo1.getDESCRIPCION());

        Lector puntaje = new Lector();

        puntaje.parsearResultado();
        puntaje.parsearPronostico();

    }
    
}