import java.util.Scanner;
public class Main {

    static Transporte transporte;

    public static void main(String[] args) {

        Scanner guardar = new Scanner(System.in);

        System.out.println("Elija un tipo de transporte"+"\n"+"1. Camión"+"\n"+"2. Bicicleta");
        int tipo = guardar.nextInt();

        transporte = FactoriaTransportes.getTransporte(tipo);

    }
}
