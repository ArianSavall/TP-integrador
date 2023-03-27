package org.example;
import com.opencsv.bean.CsvBindByPosition;
import com.opencsv.bean.CsvDate;
public class Equipo extends ResultadoEnum {

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
