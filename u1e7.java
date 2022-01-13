/*
Pedir un número, comprobar si es primo y preguntar si quiere introducir más
(S/N) y volver a pensar.
*/

import java.util.Scanner;

public class u1e7 {
    
    public static void main(String[] args) {
        
        //Inicializando las opciones y creando una nueva instancia de Scanner
        char opcion = 'S';
        Scanner sc = new Scanner(System.in);

        //Pidiendo el numero a evaluar
        System.out.print("\nDigite un numero: ");
        int numero = sc.nextInt();

        //Mientras la opcion sea 'S' o 's', elbucle continuará
        while (opcion == 'S' || opcion == 's'){

            int sum = 0;

            //El bucle for recorre desde el numero 1 hasta el numero a evaluar
            for (int i=1; i<=numero; i++){

                //Si el residuo de la division es cero, aumenta el valor del contador
                if (numero % i == 0){
                    sum ++;
                }
            }

            //Si el contador es distinto de 2, no es un numero primo
            if (sum != 2){

                System.out.println("El numero "+numero+" no es primo");
            }
            else{

                System.out.println("El numero "+numero+" es primo");
            }

            //Preguntar si se quiere evaluar otro numero
            System.out.print("\nQuiere seguir comprobando numeros? (S/N): ");
            opcion = sc.next().charAt(0);

            //Si la respuesta es 'S' o 's', vuelve a preguntar por un nuevo numero
            if (opcion == 'S' || opcion == 's'){

                System.out.print("Digite un numero: ");
                numero = sc.nextInt();
            }
            else{//Sino el programa se cierra

                System.out.println("Adios!!!!");
                break;
            }
        }

        sc.close();
    }
}
