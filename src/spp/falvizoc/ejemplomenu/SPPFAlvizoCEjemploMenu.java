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
        double lado, resultado;
        
        //Desplegamos menú
        System.out.println("Calculadora de áreas, perímetros y volúmenes de un Cuadrado");
        System.out.println("Introduzca la opción deseada");
        System.out.println("1. Calcular áreas");
        System.out.println("2. Calcular perímetros");
        System.out.println("3. Calcular volúmenes");
        System.out.println("4. Salir.");
        opEntrada = kb.nextInt();
        
        switch (opEntrada){
            case 1:
                System.out.println("Bienvenido al cálculo de áreas");
                mensajePedirDatos();
                //Llamamos el método para solicitar los datos 
                //y lo que devuelve lo guardamos en la variable lado
                lado=mensajePedirDatos();
                resultado = Math.pow(lado,2);
                System.out.println("El área del cuadrado es "+ resultado);
                break;
            case 2:
                System.out.println("Bienvenido al cálculo de perímetros");
                lado = mensajePedirDatos();
                resultado = lado * 4;
                System.out.println("El perímetro del cuadrado es "+ resultado);
                break;
            case 3:
                System.out.println("Bienvenido al cálculo de volúmenes");
                //Podemos omitir el guardar lo que devuelve el métodos
                //en una variable, colocando el mismo método en su lugar.
                resultado = Math.pow(mensajePedirDatos(), 3);
                System.out.println("El volumen del cubo es " + resultado);
                break;
            default:
                System.out.println("Adiós!");      
        }
    }
    
    static double  mensajePedirDatos (){
        //Variables
        double lado;
        Scanner kb = new Scanner (System.in);
        System.out.println("Introduce el lado del cuadrado");
        lado=kb.nextDouble();
        return lado;
    }
    
}
