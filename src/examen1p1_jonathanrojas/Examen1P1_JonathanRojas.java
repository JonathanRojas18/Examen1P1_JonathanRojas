/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examen1p1_jonathanrojas;
import java.util.Scanner;
public class Examen1P1_JonathanRojas {
    static Scanner leer = new Scanner(System.in);
    public static void main(String[] args) {
        boolean cont = true; int num;
        do{
            switch(menu()){
                case 1:
                    System.out.println("Ingrese el valor de N(entero positivo): ");
                    double n=leer.nextInt();
                    num=1;
                    while(n<=0){
                        System.out.println(" El numero debe ser mayor que 0 :");
                        System.out.println("Ingrese el valor de N(entero positivo): ");
                        n=leer.nextInt();
                    }// Fin del While
                    System.out.println(" La suma total S es :" +calcularsuma(num));
                    break;
                case 2: 
                    System.out.println("Ingrese num1: ");
                    int n1=leer.nextInt();
                    System.out.println("Ingrese num2: ");
                    int n2=leer.nextInt();
                    break;
                case 3:
                    break;
                case 4:
                    cont = false;
                    break;
                default:
                    System.out.println("Opcion no valida ");
            }
        }while(cont);
    }//Fin del Main
    public static int menu(){
        System.out.println("Menu");
        System.out.println("1. Sumatoria con Mat.pow");
        System.out.println("2. Minimo Comun multiplo ");
        System.out.println("3. Cifrado Dinamico ");
        System.out.println("4. Salir");
        int op = leer.nextInt();
        return op;
    }// Fin del menu 
    public static double calcularsuma(int n){
        double resultado=0;
        double formula;
        for(int i=1;i<=0;i++){
             formula =(3*(i*i)+2)/Math.pow(2,i);
        }
        resultado+=formula;
        return resultado;
    }//Fin del primer ejercicio
    public static double MCM(int n){
        int resultado=0;
        return resultado;
    }// Fin del Segundo ejercicio
    public static void cifrado(){
    }
}