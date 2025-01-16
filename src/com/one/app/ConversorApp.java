package com.one.app;

import com.one.modelo.ConsultaConversion;
import com.one.modelo.MonedaConvertida;

import java.util.Scanner;

public class ConversorApp {
    public static void main(String[] args) {
        int opcion;
        float valor;
        ConsultaConversion consulta = new ConsultaConversion();
        MonedaConvertida monedaConvertida;
        Scanner teclado = new Scanner(System.in);

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
                        monedaConvertida = consulta.buscarMonedaConversion("USD","ARS",valor);
                        System.out.println("El valor "+valor+"[USD] corresponde al valor final de =>> "+monedaConvertida.conversion_result()+"[ARS]");
                        break;
                    case 2:
                        monedaConvertida = consulta.buscarMonedaConversion("ARS","USD",valor);
                        System.out.println("El valor "+valor+"[ARS] corresponde al valor final de =>> "+monedaConvertida.conversion_result()+"[USD]");
                        break;
                    case 3:
                        monedaConvertida = consulta.buscarMonedaConversion("USD","BRL",valor);
                        System.out.println("El valor "+valor+"[USD] corresponde al valor final de =>> "+monedaConvertida.conversion_result()+"[BRL]");
                        break;
                    case 4:
                        monedaConvertida = consulta.buscarMonedaConversion("BRL","USD",valor);
                        System.out.println("El valor "+valor+"[BRL] corresponde al valor final de =>> "+monedaConvertida.conversion_result()+"[USD]");
                        break;
                    case 5:
                        monedaConvertida = consulta.buscarMonedaConversion("USD","COP",valor);
                        System.out.println("El valor "+valor+"[USD] corresponde al valor final de =>> "+monedaConvertida.conversion_result()+"[COP]");
                        break;
                    case 6:
                        monedaConvertida = consulta.buscarMonedaConversion("COP","USD",valor);
                        System.out.println("El valor "+valor+"[COP] corresponde al valor final de =>> "+monedaConvertida.conversion_result()+"[USD]");
                        break;
                }
            }
        }while (opcion != 7);

    }
}
