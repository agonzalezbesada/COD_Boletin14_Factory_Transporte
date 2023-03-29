import java.util.Scanner;

/**
 * Clase main, la aplicación que hace las llamdas
 * @author Adrián
 * @version 1.0
 */
public class Main {
    /**
     * Objeto estático del tipo de la interfaz
     */
    static Transporte transporte; // Creamos un objeto estático del tipo de la interfaz

    public static void main(String[] args) {

        Scanner guardar = new Scanner(System.in); // Inicializamos un Scanner

        // INICIALIZAMOS LAS VARIABLES QUE NECESITAREMOS
        /**
         * Tipo de transporte
         */
        int tipo = 0;
        /**
         * Código postal
         */
        Integer cp = 0;
        /**
         * Anchura
         */
        Float x = 0f;
        /**
         * Altura
         */
        Float y = 0f;
        /**
         * Profundidad
         */
        Float z = 0f;
        /**
         * Peso
         */
        Float peso = 0f;
        /**
         * Precio
         */
        Float precio = 0f;
        /**
         * Tipo de embalaje
         */
        Integer embalaje = 0;


        System.out.println("Elija un tipo de transporte"+"\n"+"1. Camión"+"\n"+"2. Bicicleta"+"\n"+"3. Barco");
        tipo = guardar.nextInt();

        System.out.println("Introduzca su código postal");
        cp = guardar.nextInt();

        System.out.println("Introduzca el peso del producto");
        peso = guardar.nextFloat();

        System.out.println("Introduzca la anchura del producto");
        x = guardar.nextFloat();

        System.out.println("Introduzca la altura del producto");
        y = guardar.nextFloat();

        System.out.println("Introduzca la profundidad del producto");
        z = guardar.nextFloat();

        transporte = FactoriaTransportes.getTransporte(tipo); // Igualamos el objeto de tipo interfaz al retorno de la factoría

        embalaje = transporte.tipoEmbalaje(x, y, z, peso); // Ahora podemos usar sus funciones con normalidad para obtener por ejemplo el tipo de embalaje

        switch (embalaje) {

            case 0:
                System.out.println("El tipo de embalaje será: Palet");
                break;

            case 1:
                System.out.println("El tipo de embalaje será: Envoltorio de cartón");
                break;

            case 2:
                System.out.println("El tipo de embalaje será: Caja de madera");
                break;
        }

        precio = transporte.costeTotal(cp); // O el precio

        System.out.println("El precio será: "+precio);

    }
}
