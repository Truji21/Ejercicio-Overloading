/**
* Clase Ticket del ejercicio 1 de POO
* @author David Trujillo y Gerson Gonzalez
* @version 1.0
*/

import java.util.Scanner;

public class Ticket {
    public String name;
    public int DPI;
    public double budget;
    public int amount;
    Scanner scan = new Scanner (System.in);

    void Ingreso(){
        System.out.println("Ingrese el nombre: ");
        name = scan.nextLine();

        System.out.println("Ingrese el DPI: ");
        DPI = scan.nextInt();

        System.out.println("Ingrese el presupuesto: ");
        budget = scan.nextDouble();
    }
    /**
     * Crea un número aleatorio del 1 al 15000, este sera el numero de ticket
     * @param num1 es un numero cualquiera para sobreescribir
     * @return el nuevo valor de num1
     */

    int RandomNum(int num1){
        num1 = (int)Math.random()*33001 + 1;
        return num1;
    }

    /**
     * Crea un número aleatorio del 1 al 15000 dos veces
     * @param num1 es un numero cualquiera para sobreescribir
     * @param num2 es un numero cualquiera para sobreescribir
     * @return el valor de la suma de num 2
     */
    
    int RandomNum(int num1, int num2){
        num1 = (int)Math.random()*15001 + 1;
        num2 = (int)Math.random()*15001 + 1;
        return (num1+num2);
    }

    /**
     * Decide si el ticket es valido en base a los resultados de los metodos RandomNum()
     * @see RandomNum()
     */
    
    boolean isValid(){
        if((RandomNum(0) + RandomNum(0,0))%2 == 0){
            return true;
        }else{
            return false;
        }
    }

}
