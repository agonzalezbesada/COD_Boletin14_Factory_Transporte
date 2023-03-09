public class FactoriaTransportes {

    public static final int CAMION = 1;

    public static final int BICICLETA = 2;



    public static Transporte getTransporte(int tipo) {

        switch(tipo) {

            case CAMION:

                return new Camion();

            case BICICLETA:

                return new Bicicleta();
        }

        return null;
    }

}
