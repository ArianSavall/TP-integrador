package org.example;
import com.opencsv.bean.CsvToBeanBuilder;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
public class Lector {

    String rutaResultados = "C:\\Users\\Arián Savall\\Desktop\\Curso java inicial\\TP integrador\\Resultados.csv";
    String rutaPronosticos = "C:\\Users\\Arián Savall\\Desktop\\Curso java inicial\\TP integrador\\pronostico.csv";
    List<ArchivoResultado> lineasResultado;
    List<ArchivoPronostico> lineasPronostico;

    public void LectorResultado(String ruta) {
        this.rutaResultados = ruta;
        this.lineasResultado = new ArrayList<>();
    }
    public void LectorPronostico(String ruta2) {
        this.rutaPronosticos = ruta2;
        this.lineasPronostico = new ArrayList<>();
    }
    public void parsearResultado() {
        List<ArchivoResultado> Resultados = null;
        try {
            // En esta primera línea definimos el archivos que va a ingresar
            Resultados = new CsvToBeanBuilder(new FileReader(this.rutaResultados))
                    // con esta configuración podemos skipear la primera línea de nuestro archivo CSV
                    .withSkipLines(1)
                    // con esta configuración podemos elegir cual es el caracter que vamos a usar para delimitar
                    .withSeparator(';')
                    // Es necesario definir el tipo de dato que va a generar el objeto que estamos queriendo parsear a partir del CSV
                    .withType(ArchivoResultado.class)
                    .build()
                    .parse();

        } catch (IOException e) {
            e.printStackTrace();
        }
        this.lineasResultado = Resultados;
        System.out.println(Resultados);
    }
    public void parsearPronostico() {
        List<ArchivoPronostico> Pronostico = null;
        try {
            // En esta primera línea definimos el archivos que va a ingresar
            Pronostico = new CsvToBeanBuilder(new FileReader(this.rutaPronosticos))
                    // con esta configuración podemos skipear la primera línea de nuestro archivo CSV
                    .withSkipLines(1)
                    // con esta configuración podemos elegir cual es el caracter que vamos a usar para delimitar
                    .withSeparator(';')
                    // Es necesario definir el tipo de dato que va a generar el objeto que estamos queriendo parsear a partir del CSV
                    .withType(ArchivoResultado.class)
                    .build()
                    .parse();

        } catch (IOException e) {
            e.printStackTrace();
        }
        this.lineasPronostico = Pronostico;
        System.out.println(Pronostico);
    }




//    public void puntaje() {
//
//
//        try {
//            BufferedReader resultadosReader = new BufferedReader(new FileReader(resultados));
//            BufferedReader pronosticosReader = new BufferedReader(new FileReader(pronosticos));
//
//            String resultadoLine = resultadosReader.readLine();
//            String pronosticoLine = pronosticosReader.readLine();
//
//            System.out.println("Pronósticos:");
//            while (pronosticoLine != null) {
//                String[] pronosticoValues = pronosticoLine.split(";");
//                String pronostico = pronosticoValues[0] + " - " + pronosticoValues[0];
//                String[] filaPronosticos = {pronostico};
//                tablaPronosticos.add(filaPronosticos);
//                System.out.println(pronosticoLine);
//                pronosticoLine = pronosticosReader.readLine();
//            }
//
//            System.out.println();
//
//            System.out.println("Resultados:");
//            while (resultadoLine != null) {
//                String[] resultadoValues = resultadoLine.split(";");
//                String resultado = resultadoValues[0] + " - " + resultadoValues[0];
//                String[] filaResultados = {resultado};
//                tablaResultados.add(filaResultados);
//                System.out.println(resultadoLine);
//                resultadoLine = resultadosReader.readLine();
//            }
//
//            resultadosReader.close();
//            pronosticosReader.close();
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//        int puntaje = 0;
//        for (int i = 0; i < tablaResultados.size(); i++) {
//            String[] pronostico = tablaPronosticos.get(i);
//            String[] resultado = tablaResultados.get(i);
//            if (resultado[0].equals(pronostico[0])) {
//                puntaje += 1;
//            }
//        }
//
//        System.out.println();
//
//        System.out.println("El puntaje de la persona es: " + puntaje);
//    }
        }