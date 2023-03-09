public interface Transporte {

    final Integer PALET = 0;

    final Integer ENVOLTORIO_CARTON = 1;

    final Integer CAJA_MADERA = 2;


    Float costeTotal(Integer cp);

    Integer tipoEmbalaje(Float x, Float y, Float z, Float peso);
}
