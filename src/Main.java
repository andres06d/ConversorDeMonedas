import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        Conversor convertidor = new Conversor();
        Scanner datos = new Scanner(System.in);
        int seleccion = 0;

        double montoAConverir = 0;

        while (true) {
            System.out.println("""
                    1) Dolar =>> Peso argentino
                    2) Peso argentino =>> Dolar
                    3) Dolar =>> Real brasileño
                    4) Real brasileño a dolar
                    5) Dolar =>> Peso colombiano
                    6) Peso colombiano =>> Dolar
                    7) Salir
                    Elija una opcion valida:
                    *********************************************************
                    """);
            try {
                seleccion = datos.nextInt();
                if (seleccion == 7) {
                    break;
                } else {
                    System.out.println("Digite el monto a convertir");
                    montoAConverir = datos.nextDouble();
                    switch (seleccion) {
                        case 1:
                            System.out.println(convertidor.convertir("USD", "ARS", montoAConverir));
                            break;
                        case 2:
                            System.out.println(convertidor.convertir("ARS", "USD", montoAConverir));
                            break;

                        case 3:
                            System.out.println(convertidor.convertir("USD", "BRL", montoAConverir));
                            break;
                        case 4:
                            System.out.println(convertidor.convertir("BRL", "USD", montoAConverir));
                            break;
                        case 5:
                            System.out.println(convertidor.convertir("USD", "COP", montoAConverir));
                            break;
                        case 6:
                            System.out.println(convertidor.convertir("COP", "USD", montoAConverir));
                            break;

                    }

                }

            } catch (InputMismatchException e) {
                System.out.println("Ingreso una opcion invalida");
                break;
            }
        }
    }


}
