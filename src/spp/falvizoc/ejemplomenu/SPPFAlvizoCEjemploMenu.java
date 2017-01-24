/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp.falvizoc.ejemplomenu;
import java.util.Scanner;
/**
 *
 * @author falvizo
 */
public class SPPFAlvizoCEjemploMenu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Variables.
        int opEntrada;
        Scanner kb = new Scanner (System.in);
        
        //Desplegamos menú
        System.out.println("Calculadora de áreas, perímetros y volúmenes");
        System.out.println("Introduzca la opción deseada");
        System.out.println("1. Calcular áreas");
        System.out.println("2. Calcular perímetros");
        System.out.println("3. Calcular volúmenes");
        System.out.println("4. Salir.");
        opEntrada = kb.nextInt();
        
        switch (opEntrada){
            case 1:
                System.out.println("Bienvenido al cálculo de áreas");
                break;
            case 2:
                System.out.println("Bienvenido al cálculo de perímetros");
                break;
            case 3:
                System.out.println("Bienvenido al cálculo de volúmenes");
                break;
            default:
                System.out.println("Adiós!");      
        }
    }
    
}
