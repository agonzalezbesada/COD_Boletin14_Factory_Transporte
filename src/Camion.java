public class Camion implements Transporte{
    @Override
    public Float costeTotal(Integer cp) {
        Float coste = 0f;
        return coste;
    }
    @Override
    public Integer tipoEmbalaje(Float x, Float y, Float z, Float peso) {

        Integer tipoEmbalaje = 0;

        Float dimensiones = x + y + z;

        if (dimensiones<=8 && peso<=5) {

            tipoEmbalaje = ENVOLTORIO_CARTON;
            return tipoEmbalaje;

        } else if (dimensiones<=8 && peso>5) {

            tipoEmbalaje = CAJA_MADERA;
            return tipoEmbalaje;

        } else if (dimensiones>8 && peso>5) {

            tipoEmbalaje = PALET;
            return tipoEmbalaje;
        }
        return null;
    }
}
