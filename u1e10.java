//Muestra la serie de fibonacci hasta un número pedido por teclado. 

import java.util.Scanner;

public class u1e10 {
    
    public static void main(String[] args) {
        
        //Creando una nueva instancia de Scanner
        Scanner sc = new Scanner(System.in);

        //Pidiendo por consola el numero limite para la serie
        System.out.println("\nSucesion de Fibonacci");
        System.out.print("Digite un numero (mayor que 1): ");
        int n = sc.nextInt();

        int a = 0, b = 1;

        System.out.println("\nSerie de Fibonnacci hasta el numero "+n);
        while (a<n){

            System.out.println(a+" ");
            b = a+b;
            a = b-a;
        }

        sc.close();
    }
}