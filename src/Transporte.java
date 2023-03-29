/**
 * Interfaz utilizada para conectar con implementación los diferentes objetos y que tengan atributos y funciones comunes
 * @author Adrián
 * @version 1.0
 */
public interface Transporte {
    // Variables estáticas para los tipos de embalaje
    /**
     * Variable estática para Palet
     */
    final Integer PALET = 0;
    /**
     * Variable estática para Envoltorio de cartón
     */
    final Integer ENVOLTORIO_CARTON = 1;
    /**
     * Variable estática para Caja de madera
     */
    final Integer CAJA_MADERA = 2;

    /**
     * Método que calcula el coste del transporte y devuelve un precio
     * @param cp Código postal
     * @return Precio
     */
    Float costeTotal(Integer cp);

    /**
     * Método que decide qué tipo de embalaje debe usar el pedido
     * @param x Altura
     * @param y Anchura
     * @param z Profundidad
     * @param peso Peso
     * @return Tipo de embalaje
     */
    Integer tipoEmbalaje(Float x, Float y, Float z, Float peso);
}
