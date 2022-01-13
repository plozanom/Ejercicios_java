/*
Realizar un programa que realice el promedio de las notas de un alumno,
para ello el programa va a tener que solicitar el nombre del alumno y las
notas de las 3 evaluaciones. Si el alumno tiene un promedio mayor o igual a
3.0 también debe imprimir “Aprobado”, si no alcanzó esa nota debe imprimir
“Reprobado” . Requisitos: Las notas que se ingresan pueden tener
decimales
*/

import java.util.Scanner;

public class u1e2 {
    
    public static void main(String[] args) {
        
        //Inicializando variables
        String nombre;
        double nota, sumatoria=0, promedio;

        //Creando una nueva instancia de Scanner
        Scanner sc = new Scanner(System.in);

        //Pidiendo por consola las variables
        System.out.print("\nDigite el nombre del alumno: ");
        nombre = sc.nextLine();

        for (int i=0; i<3; i++){//Utilizando el bucle for para agilizar la obtencion de datos

            System.out.print("Digite la nota #"+(i+1)+" : ");
            nota = sc.nextDouble();
            sumatoria += nota;
        }

        //Hallando el promedio
        promedio = sumatoria/3;

        //Utilizando condicionales para saber si se ha reprobado o aprobado
        if (promedio>=3.0){
            System.out.println("\nEl alumno "+nombre+" ha Aprobado");
        }
        else{
            System.out.println("\nEl alumno "+nombre+" ha Reprobado");
        }

        sc.close();
    }
}
