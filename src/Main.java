import java.util.Scanner;
public class Main {

    static Transporte transporte;

    public static void main(String[] args) {

        Scanner guardar = new Scanner(System.in);

        int tipo = 0;
        Integer cp = 0;
        Float x = 0f;
        Float y = 0f;
        Float z = 0f;
        Float peso = 0f;
        Float precio = 0f;

        Integer embalaje = 0;


        System.out.println("Elija un tipo de transporte"+"\n"+"1. Camión"+"\n"+"2. Bicicleta");
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

        transporte = FactoriaTransportes.getTransporte(tipo);

        embalaje = transporte.tipoEmbalaje(x, y, z, peso);

        if (embalaje==0) {
            System.out.println("El tipo de embalaje será: Palet");
        } else if (embalaje==1) {
            System.out.println("El tipo de embalaje será: Envoltorio de cartón");
        } else if (embalaje==2) {
            System.out.println("El tipo de embalaje será: Caja de madera");
        }

        precio = transporte.costeTotal(cp);

        System.out.println("El precio será: "+precio);

    }
}
