import java.util.Scanner;

public class ConversorApp {
    public static void main(String[] args) {
        int opcion;
        float valor;
        String key = "747ea034b2c12ee2f0c7aa38";
        Scanner teclado = new Scanner(System.in);
        Http

        do {
            System.out.println("****************************************************");
            System.out.println("Sea bienvenido/a al Conversor de Moneda :)\n");
            System.out.println("1) Dólar =>> Peso argentino");
            System.out.println("2) Peso argentino =>> Dólar");
            System.out.println("3) Dólar =>> Real brasileño");
            System.out.println("4) Real brasileño =>> Dólar");
            System.out.println("5) Dólar =>> Peso colombiano");
            System.out.println("6) Peso colombiano =>> Dólar");
            System.out.println("7) Salir");
            System.out.println("Elija una opción válida:");
            System.out.println("****************************************************");
            opcion = teclado.nextInt();
            if(opcion != 7){
                System.out.println("Ingrese el valor que deseas convertir: ");
                valor = teclado.nextFloat();
                switch (opcion){
                    case 1:
                        System.out.println("El valor "+valor+"[USD] corresponde al valor final de =>> "+"[ARS]");
                        break;
                    case 2:
                        System.out.println("El valor "+valor+"[ARS] corresponde al valor final de =>> "+"[USD]");
                        break;
                    case 3:
                        System.out.println("El valor "+valor+"[USD] corresponde al valor final de =>> "+"[BRL]");
                        break;
                    case 4:
                        System.out.println("El valor "+valor+"[BRL] corresponde al valor final de =>> "+"[ARS]");
                        break;
                    case 5:
                        System.out.println("El valor "+valor+"[USD] corresponde al valor final de =>> "+"[COP]");
                        break;
                    case 6:
                        System.out.println("El valor "+valor+"[COP] corresponde al valor final de =>> "+"[USD]");
                        break;
                }
            }
        }while (opcion != 7);

    }
}
