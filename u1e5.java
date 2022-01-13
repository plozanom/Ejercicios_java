/*
Generar un número aleatorio entre el 1 y el 100, el usuario lo tiene que
adivinar introduciendo el número por teclado. En el caso que el número a
adivinar sea mayor al ingresado, decirle al usuario “El número que busca es
mayor”, de lo contrario, “El número que busca es menor”. El programa
finalizará cuando se introduzca el número correcto.
*/

import java.util.Random;
import java.util.Scanner;

public class u1e5 {
    
    public static void main(String[] args) {
        
        //Creando una nueva instancia de random
        Random ran = new Random();
        int adivinar = ran.nextInt(100)+1;

        //Creando una nueva instancia de Scanner
        Scanner sc = new Scanner(System.in);

        //Pidiendo por primera vez, por consola, un numero de 1 a 100 para adivinar
        System.out.println("\nTratemos de adivinar un numero!!!");
        System.out.print("Digita un numero entre 1 y 100: ");
        int adivinando = sc.nextInt();

        //Utilizando un bucle while para que el programa continue hasta que el numero sea adivinado
        while (adivinando != adivinar){

            //Si el numero dado por consola es mayor que el numero a adivinar, lo indica y pide otro numero
            if (adivinando > adivinar){
                System.out.println("\nNo has adivinado el numero!!!");
                System.out.println("El numero que buscas es menor que "+adivinando);
                System.out.print("Intenta con otro numero: ");
                adivinando = sc.nextInt();
            }
            else{//Sino, indica que el numero a adivinar es mayor y pide otro numero
                System.out.println("\nNo has adivinado el numero!!!");
                System.out.println("El numero que buscas es mayor que "+adivinando);
                System.out.print("Intenta con otro numero: ");
                adivinando = sc.nextInt();
            }
        }

        //Si los numeros concuerdan, lo muestra en pantalla
        if (adivinando == adivinar){
            System.out.println("\nHas adivinado!!!!, el numero es: "+adivinar);
        }

        sc.close();
    }
}
