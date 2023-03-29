/**
 * Clase que devuelve las instancias de los objetos
 * @author Adrián
 * @version 1.0
 */
public class FactoriaTransportes {
    // Variables estáticas para los tipos de transporte
    /**
     * Variable estática para Camión
     */
    public static final int CAMION = 1;
    /**
     * Variable estática para Bicicleta
     */
    public static final int BICICLETA = 2;
    /**
     * Variable estática de Barco
     */
    public static final int BARCO = 3;


    /**
     * Método que devuelve una instancia del tipo solicitado
     * @param tipo Tipo de objeto solicitado
     * @return El tipo de objeto a crear
     */
    public static Transporte getTransporte(int tipo) {

        switch(tipo) {

            case CAMION:

                return new Camion();

            case BICICLETA:

                return new Bicicleta();

            case BARCO:

                return  new Barco();
        }

        return null;
    }

}
