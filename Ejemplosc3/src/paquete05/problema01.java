/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete05;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author danielrios
 */
public class Problema01 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        String[] nombresEstaciones = new String[5];
        double[][] produccion = new double[5][12];
        double[] sumaProduccion = new double[5];

        for (int i = 0; i < nombresEstaciones.length; i++) {
            System.out.print("Ingrese nombre encargado estación " + (i + 1)
                    + "\n");
            nombresEstaciones[i] = entrada.nextLine();
            for (int j = 0; j < 12; j++) {
                System.out.print("Producción del Mes " + (j + 1) + "\n");
                produccion[i][j] = entrada.nextDouble();

            }
        }
        double produccionMayor = 0;
        int primeraPosicion = 0;

        for (int i = 0; i < 5; i++) {
            double sumaFila = 0;

            for (int j = 0; j < 12; j++) {
                sumaFila = sumaFila + produccion[i][j];
            }

        }
    }
}
