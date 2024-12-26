import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        ConsultarMoneda consulta = new ConsultarMoneda();

        int opcion=0;
        while (opcion !=8){
            System.out.println("**************************************\n" +
                    "Bienvenidos al conversor de Monedas\n\n" +
                    "Ingresa la conversion que deseas realizar\n\n" +
                    "1- Dollar a Peso Argentino\n" +
                    "2- Peso Argentino a Dollar\n" +
                    "3- Dollar a Real Brasilero\n" +
                    "4- Real Brasilero a Dollar\n" +
                    "5- Dollar a peso Colombiano\n" +
                    "6- Peso Colombiano a Dollar\n" +
                    "7- Convertir otra moneda\n" +
                    "8- Salir");
            opcion = lectura.nextInt();
            lectura.nextLine();

            switch (opcion) {
                case 1:
                    convertirMoneda.convertir("USD", "ARS", consulta, lectura);
                    break;
                case 2:
                    convertirMoneda.convertir("ARS", "USD", consulta, lectura);
                    break;
                case 3:
                    convertirMoneda.convertir("USD", "BRL", consulta, lectura);
                    break;
                case 4:
                    convertirMoneda.convertir("BRL", "USD", consulta, lectura);
                    break;
                case 5:
                    convertirMoneda.convertir("USD", "COP", consulta, lectura);
                    break;
                case 6:
                    convertirMoneda.convertir("COP", "USD", consulta, lectura);
                    break;
                case 7:
                    convertirMoneda.convertirOtraMoneda(consulta, lectura);
                    break;
                case 8:
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opcion no valida");
                    break;
            }
        }
    }
}
