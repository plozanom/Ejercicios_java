/*
Realiza un programa que solicite el sexo (H/M) y la altura (cm) al usuario y
que calcule el peso ideal.
○ peso ideal mujeres = altura - 120
○ peso ideal hombres = altura - 110
*/

import java.util.Scanner;

public class u1e6 {
    
    public static void main(String[] args) {

        //Creando una nueva instancia de Scanner
        Scanner sc = new Scanner(System.in);

        //Pidiendo por consola tanto el sexo como la altura
        System.out.print("\nDigite el sexo de la persona (H/M):");
        char sexo =sc.next().charAt(0);

        System.out.print("\nDigite la estatura de la persona(en cm): ");
        int altura = sc.nextInt();

        //Hallar el peso ideal teniendo en cuenta el sexo de la persona
        if (sexo == 'M' || sexo == 'm'){
            
            System.out.println("\nEl peso ideal de esta mujer es de: "+(altura-120)+"Kg");
        }
        else if(sexo == 'H'|| sexo == 'h'){

            System.out.println("\nEl peso ideal de este hombre es de: "+(altura-110)+"Kg");
        }
        else {//Si la opcion no es correcta, lo indica

            System.out.println("\nDigite una opcion correcta");
        }

        sc.close();
    }
}
