import Modelos.Pronostico;
import Modelos.ResultadoEnum;
import Utilities.Lector;

import java.util.List;

public class Main {
    public static void main(String[] args) {

    Lector lector = new Lector (args[0],args[1]);
    List<Pronostico> pronosticos = lector.getPronostico();
    List<ResultadoEnum> resultados = lector.getResultados();

    lector.calcularGanador(resultados);

     for(ResultadoEnum resultado : resultados) {
        resultado.imprimirResultados(resultado);
     }
     for(Pronostico pronostico : pronosticos){
            pronostico.imprimirPronostico(pronostico);
     }

    }




    
}