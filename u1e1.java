/*
Realizar la suma, la resta, la división y la multiplicación de dos números
leídos por teclado y mostrar en pantalla “La <operación> de <número 1>
y <número 2> es igual a <resultado> ”.
*/

import java.util.Scanner;

public class u1e1 {
    
    public static void main(String[] args) {
        
        int numero1, numero2;//Inicializando variables

        Scanner sc = new Scanner(System.in);//Creando una nueva instancia de Scanner

        //Pidiendo por consola numero1 y numero2
        System.out.print("\nDigite su primer numero: ");
        numero1 = sc.nextInt();
        System.out.print("Digite su segundo numero: ");
        numero2 = sc.nextInt();

        //Haciendo operaciones y mostrando los resultados
        System.out.println("\nLa suma de "+numero1+" y "+numero2+" es igual a "+(numero1+numero2));
        System.out.println("\nLa resta de "+numero1+" y "+numero2+" es igual a "+(numero1-numero2));
        System.out.println("\nLa multiplicacion de "+numero1+" y "+numero2+" es igual a "+(numero1*numero2));
        System.out.println("\nLa division de "+numero1+" y "+numero2+" es igual a "+((float)numero1/(float)numero2));

        sc.close();
    }
}