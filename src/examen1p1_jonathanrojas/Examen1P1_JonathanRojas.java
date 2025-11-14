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
            switch(Menu()){
                case 1:
                    break;
                case 2:
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
    public static int Menu(){
        
        System.out.println("*****Menú*****");
        System.out.println("1) Sumatoria");
        System.out.println("2) en proceso");
        System.out.println("3) Salir");
        System.out.print(">>Ingrese el numero de la opcion que desea: ");
        int op = leer.nextInt();
        return op;
    }
}
