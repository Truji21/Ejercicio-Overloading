/**
* Programa principal del ejercicio 1 de POO
* @author David Trujillo y Gerson Gonzalez
* @version 1.0
*/

import java.util.Scanner;

public class Main{

private int sold = 0;
private int actual_location = 0;
private int budget = 0;
private double gananciasA = 0;
private double gananciasB = 0;
private double gananciasC = 0;
Ticket ticket = new Ticket();

//Aqui se debería crear un menú de selección para poder elegir entre
//1. Crear cliente
//2. Comprar boletos
//3. Consultar disponibilidad total
//4. Consultar disponibilidad de una localidad
//5. Mostrar las ganancias
//6. Salir del programa


//Crea una instancia nueva de la clase Ticket

void newClient(){
    Ticket ticket = new Ticket();
    ticket.Ingreso();
}

void sell(){
    //codigo usado al intentar vender un ticket
}

//Compara la cantidad de tickets vendidos con la cantidad de tickets que se estan pidiendo

boolean spacecheck(){
    if((60-sold) > ticket.amount){
        return true;
    }else{
        return false;
    }
}


}
