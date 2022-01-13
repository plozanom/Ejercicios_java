/*
Realizar un programa que calcule el sueldo de un trabajador, el programa
solicita el número de horas que has trabajado en un mes, las horas se
pagan a $30.000.
*/

import java.util.Scanner;

public class u1e3 {
    
    public static void main(String[] args) {
        
        //Inicializando las variables y haciendo una nueva instancia de Scanner
        int horas;
        Scanner sc = new Scanner(System.in);

        //Pidiendo el numero de horas trabajadas al mes
        System.out.print("\nIngrese el numero de horas trabajadas al mes: ");
        horas = sc.nextInt();

        System.out.println("\nEl sueldo del trabajador es de $"+(horas*30000));

        sc.close();
    }
}
