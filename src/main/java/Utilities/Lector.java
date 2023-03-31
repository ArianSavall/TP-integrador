package Utilities;

import Modelos.Pronostico;
import Modelos.ResultadoEnum;
import com.opencsv.CSVParser;
import com.opencsv.CSVParserBuilder;
import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;
import com.opencsv.bean.CsvToBeanBuilder;
import com.opencsv.exceptions.CsvValidationException;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
public class Lector {

    private String rutaPronostico;
    private String rutaResultados;


    public String getRutaPronostico() {
        return rutaPronostico;
    }

    public Lector(String rutaPronostico, String rutaResultados) {
        this.rutaPronostico = rutaPronostico;
        this.rutaResultados = rutaResultados;
    }


    public List<Pronostico> getPronostico() {

        List<Pronostico> pronostico = new ArrayList<>();

        try {
            pronostico = new CsvToBeanBuilder<Pronostico>(new FileReader(this.rutaPronostico))
                    .withSkipLines(1)
                    .withSeparator(';')
                    .withType(Pronostico.class)
                    .build()
                    .parse();

        } catch (IOException e) {
            e.printStackTrace();
        }

        return pronostico;
    }

    public List<ResultadoEnum> getResultados() {

        List<ResultadoEnum> resultados = new ArrayList<>();

        try {
            resultados = new CsvToBeanBuilder<ResultadoEnum>(new FileReader(this.rutaResultados))
                    .withSkipLines(1)
                    .withSeparator(';')
                    .withType(ResultadoEnum.class)
                    .build()
                    .parse();

        } catch (IOException e) {
            e.printStackTrace();
        }

        return resultados;
    }

    public List<Integer> calcularGanador(List<ResultadoEnum> resultados) {
        CSVParser parser = null;
        CSVReader lector = null;
        List<Integer> iResultados = new ArrayList<>(); //esta lista la vamos a usar para compararla con el pronostico y ver si el usuario acertó.
        try {
            parser = new CSVParserBuilder()
                    .withSeparator(';')
                    .build();
            lector = new CSVReaderBuilder(new FileReader(this.rutaResultados))
                    .withCSVParser(parser)
                    .withSkipLines(1)
                    .build();

            int i = 0;
            String[] fila;


            while ((fila = lector.readNext()) != null) {

                if (Integer.parseInt(fila[1]) > Integer.parseInt(fila[2])) //si Cant.goles1 es mayor a Cant.goles2
                    System.out.println("Ganó el equipo 1");
                    iResultados.add(i, 1);
                if (Integer.parseInt(fila[1]) < Integer.parseInt(fila[2])) //si Cant.goles1 es menor a Cant.goles2
                    System.out.println("Ganó el equipo 2");
                    iResultados.add(i, 2);
                if (Integer.parseInt(fila[1]) == Integer.parseInt(fila[2])) //si Cant.goles1 es igual a Cant.goles2
                    System.out.println("Empataron ambos equipos");
                    iResultados.add(i, 0);

                   i++;
            }

        }catch(CsvValidationException | IOException e){
            throw new RuntimeException(e);
        }
        System.out.println(iResultados);
        return iResultados;
    }

}


