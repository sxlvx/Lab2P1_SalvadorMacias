package com.mycompany.lab2p1_salvadormacias;

import java.util.Scanner;

public class Lab2P1_SalvadorMacias {

    public static Scanner lea = new Scanner(System.in);
    public static Scanner str = new Scanner(System.in);

    public static void main(String[] args) {
        boolean salida = true;
        do {
            System.out.println("Bienvenido al menu!");
            System.out.println("Estas son las opciones disponibles: ");
            System.out.println("1.Numero perfecto\n2.Sumatoria\n3.Serie\n4.Salir");
            System.out.println("Ingrese una de las opciones disponibles: ");
            int opc = lea.nextInt();

            switch (opc) {

                case 1: {

                    boolean primo = true;
                    int suma = 0;

                    System.out.print("Ingrese n: ");
                    int num = lea.nextInt();

                    for (int i = 1; i < num; i++) {
                        if (num % i == 0) {
                            suma += i;
                            primo = false;
                        }
                    }
                    if (primo) {
                        System.out.println("Es primo, no se pudo realizar el calculo por falta de divisores.");
                    } else if (suma == num) {
                        System.out.println("Es un numero perfecto.");
                        for (int i = 2; i < num; i++) {
                            if (num % i == 0) {
                                System.out.print("Divisores:" + "1" + i + " ");

                                System.out.print(i + " ");
                            }
                        }
                    }

                }//fin case 1
                break;

                case 2: {
                    double K;
                    double n = 1.0;
                    double numerador;
                    double denominador;
                    double sumatoria = 0;

                    System.out.println("Ingrese K: ");
                    K = lea.nextDouble();

                    if (K <= 0) {
                        System.out.println("El numero que ha ingresado es negativo.");
                    }//Fin de validacion
                    else {
                        while (n <= K) {
                            numerador = 2 * n - 1;
                            denominador = n * (n + 1);
                            double operacion = numerador / denominador;
                            sumatoria = +Math.pow(operacion, n);
                            n++;
                        }//Fin de while

                        System.out.println("El valor de la sumatoria es: " + sumatoria);
                    }

                }//fin case 2    
                break;

                case 3: {
                    int a = 0, b = 1, neg = -1;

                    System.out.println("ingrese n ");
                    int n = lea.nextInt();
                    System.out.println("ingrese x ");
                    int x = lea.nextInt();
                    for (int i = 1; i <= x; i++) {
                        System.out.print("0 1 " + n);
                        System.out.println("");

                        n += 5;

                    }

                }//fin case 3
                break;

                case 4: {
                    salida = false;
                    System.out.println("Se abandonara el programa");

                }//fin case 4
                break;

                default:
                    System.out.println("Opcion ingresada no es valida");

            }//fin switch

        } while (salida != false);//fin while

    }//fin main

}//fin clase

