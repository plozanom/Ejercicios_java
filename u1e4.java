/*
Solicitar un número al usuario y mostrar la tabla de multiplicar de ese
número, desde el 0 hasta el 10
*/

import java.util.Scanner;

public class u1e4 {
    
    public static void main(String[] args) {
        
        //Inicializando las variables y haciendo una nueva instancia de Scanner
        int numero;
        Scanner sc = new Scanner(System.in);

        //Pidiendo un numero por consola
        System.out.print("Digite numero: ");
        numero = sc.nextInt();

        //Creando la tabla de multliplicar utilizando el bucle for
        System.out.println("\nTABLA DE MULTIPLICAR DEL "+numero);

        for (int i=0; i<=10; i++){
            System.out.println(numero +" * "+i+" = "+numero*i);
        }

        sc.close();
    }
}
