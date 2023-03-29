/**
 * Objeto de tipo Bicicleta que implementa Transporte
 * @author Adrián
 * @version 1.0
 */
public class Bicicleta implements Transporte{
    @Override
    public Float costeTotal(Integer cp) {
        Float coste = 1f;
        return coste;
    }
    @Override
    public Integer tipoEmbalaje(Float x, Float y, Float z, Float peso) {
        /**
         * Variable que determina las dimensiones
         */
        Float dimensiones = x + y + z;

        if (dimensiones<=8 && peso<=5) {

            return ENVOLTORIO_CARTON;

        } else if (dimensiones<=8 && peso>5) {

            return CAJA_MADERA;

        } else if (dimensiones>8 && peso>5) {

            return PALET;
        }
        return null;
    }
}
