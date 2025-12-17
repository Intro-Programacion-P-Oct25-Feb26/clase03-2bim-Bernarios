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
        int[][] produccion = new int[5][12];

        for (int i = 0; i < nombresEstaciones.length; i++) {
            System.out.print("Ingrese nombre encargado estación " + (i + 1)
                    + "\n");
            nombresEstaciones[i] = entrada.nextLine();
            for (int j = 0; j < 12; j++) {
                System.out.print("Producción del Mes " + (j + 1) + "\n");
                produccion[i][j] = entrada.nextInt();
                entrada.nextLine();
            }
        }
        int produccionMayor = 0;
        int primeraPosicion = 0;

        for (int i = 0; i < 5; i++) {
            int sumaFila = 0;

            for (int j = 0; j < 12; j++) {
                sumaFila = sumaFila + produccion[i][j];
            }
            System.out.printf("\n%s Estación %s - Total Producción: $ %s", 
                    nombresEstaciones[i], (i + 1), sumaFila);

            if (sumaFila > produccionMayor) {
                produccionMayor = sumaFila;
                primeraPosicion = i;
            }
        }

        System.out.printf("\nEstación más productiva: Estación %d\n"
                + "Encargado de la estación: %s\n"
                + "Cantidad de la estación más productiva: $ %s\n",
                (primeraPosicion + 1),
                nombresEstaciones[primeraPosicion],
                produccionMayor);
    }
}
