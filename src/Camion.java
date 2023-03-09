public class Camion implements Transporte{

    public Float costeTotal(Integer cp) {
        Float coste = 0f;
        return coste;
    }

    public Integer tipoEmbalaje(Float x, Float y, Float z, Float peso) {

        Integer tipoEmbalaje = 0;

        Float dimensiones = x + y + z;

        if (dimensiones>=8) {

            tipoEmbalaje = 0;
            return tipoEmbalaje;

        } else {

            if (peso<=5) {

                tipoEmbalaje = 1;
                return tipoEmbalaje;

            } else {

                tipoEmbalaje = 2;
                return tipoEmbalaje;

            }
        }

    }
}
