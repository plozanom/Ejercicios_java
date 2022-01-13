import java.util.Scanner;

/*
Pide por teclado el nombre, edad y salario y muestra el salario
○ Si es menor de 16 no tiene edad para trabajar
○ Entre 19 y 50 años el salario es un 5 por ciento más
○ Entre 51 y 60 años el salario es un 10 por ciento más
○ Si es mayor de 60 el salario es un 15 por ciento más
*/

public class u1e9 {
    
    public static void main(String[] args) {
        
        //Creando una nueva instancia de Scanner
        Scanner sc = new Scanner(System.in);

        //Pidiendo el nombre del trabajador
        System.out.print("Ingrese su nombre: ");
        String nombre = sc.nextLine();

        //Pidiendo edad
        System.out.print("Ingrese su edad: ");
        int edad = sc.nextInt();

        //Dependiendo de la edad, se aplican diferentes aumentos
        if (edad < 16){

            System.out.println("\nNo tienes edad para trabajar");
        }
        else{            

            System.out.print("Ingrese su salario: ");
            int salario = sc.nextInt();

            System.out.println("\nNombre: "+nombre);
            System.out.println("Edad: "+edad);

            if (edad >=16 && edad < 19){

                System.out.println("Su salario es: "+salario);
            }
            else if(edad>=19 && edad<50){

                System.out.println("Su salario es: "+(salario*1.05));
            }
            else if(edad>=50 && edad<60){

                System.out.println("Su salario es: "+(salario*1.10));
            }
            else if(edad>=60){

                System.out.println("Su salario es: "+(salario*1.15));
            }
        }

        sc.close();
    }
}
