package org.example;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
public class Lector{

    private String  resultados = "C:\\Users\\Arián Savall\\Desktop\\Curso java inicial\\TP integrador\\Resultados.csv";
    private String pronosticos = "C:\\Users\\Arián Savall\\Desktop\\Curso java inicial\\TP integrador\\pronostico.csv";

    private List<String[]> tablaPronosticos = new ArrayList<>();
    private List<String[]> tablaResultados = new ArrayList<>();
    public void puntaje() {


        try {
            BufferedReader resultadosReader = new BufferedReader(new FileReader(resultados));
            BufferedReader pronosticosReader = new BufferedReader(new FileReader(pronosticos));

            String resultadoLine = resultadosReader.readLine();
            String pronosticoLine = pronosticosReader.readLine();

            System.out.println("Pronósticos:");
            while (pronosticoLine != null) {
                String[] pronosticoValues = pronosticoLine.split(";");
                String pronostico = pronosticoValues[0] + " - " + pronosticoValues[0];
                String[] filaPronosticos = {pronostico};
                tablaPronosticos.add(filaPronosticos);
                System.out.println(pronosticoLine);
                pronosticoLine = pronosticosReader.readLine();
            }

            System.out.println();

            System.out.println("Resultados:");
            while (resultadoLine != null) {
                String[] resultadoValues = resultadoLine.split(";");
                String resultado = resultadoValues[0] + " - " + resultadoValues[0];
                String[] filaResultados = {resultado};
                tablaResultados.add(filaResultados);
                System.out.println(resultadoLine);
                resultadoLine = resultadosReader.readLine();
            }

            resultadosReader.close();
            pronosticosReader.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

        int puntaje = 0;
        for (int i = 0; i < tablaResultados.size(); i++) {
            String[] pronostico = tablaPronosticos.get(i);
            String[] resultado = tablaResultados.get(i);
            if (resultado[0].equals(pronostico[0])) {
                puntaje += 1;
            }
        }

        System.out.println();

        System.out.println("El puntaje de la persona es: " + puntaje);
    }
}