/*
Realizar un programa que permita controlar el juego de piedra, papel, tijera
introduciendo P para piedra, L para papel y T para tijera por cada jugador.
El sistema debe indicar qué jugador gana la ronda o si hay empate. Al final
de cada ronda preguntar si desea volver a jugar.
*/

import java.util.Random;
import java.util.Scanner;
import java.lang.Character;

public class u1e8 {
    
    public static void main(String[] args) {
        
        char eleccion = 'S';
        Scanner sc = new Scanner(System.in);//Creando una nueva instancia de Scanner
        String opciones = "PLT";
        Random ran = new Random();//Creando una nueva instancia de Random
        char pc = opciones.charAt(ran.nextInt(opciones.length()));//Se elige de manera aleatoria un caracter
        //del String opciones

        //Pidiendo que se de una de las 3 opciones
        System.out.print("\nIngrese su eleccion (P=piedra, L=papel, T=tijeras): ");
        char me = sc.next().charAt(0);//Se toma el primer caracter que se ponga por consola
        me = Character.toUpperCase(me);//Convirtiendo cualquier caracter en mayuscula

        //Usando el bucle while para que mientras la eleccion sea 'S' o 's' continue el juego
        while(eleccion == 'S' || eleccion == 's'){
            switch(pc){//Utilizando un bucle switch anidado para hacer la comparacion entre pc y me
                case 'P':
                    switch(me){
                        case 'P':System.out.println("\nHas empatado!!");break;
                        case 'L':System.out.println("\nHas ganado!!");break;
                        case 'T':System.out.println("\nHas perdido!!");break;
                    }
                    break;
                case 'L':
                    switch(me){
                        case 'L':System.out.println("\nHas empatado!!");break;
                        case 'T':System.out.println("\nHas ganado!!");break;
                        case 'P':System.out.println("\nHas perdido!!");break;
                    }
                    break;
                case 'T':
                    switch(me){
                        case 'T':System.out.println("\nHas empatado!!");break;
                        case 'P':System.out.println("\nHas ganado!!");break;
                        case 'L':System.out.println("\nHas perdido!!");break;
                    }
                    break;
            }

            //Preguntando si se va a continuar jugando o no
            System.out.print("\nDesea seguir jugando? (S/N): ");
            eleccion = sc.next().charAt(0);
            
            //Utilizando un condicional para saber si se continua
            if(eleccion == 'S' || eleccion == 's'){

                pc = opciones.charAt(ran.nextInt(opciones.length()));

                System.out.print("\nIngrese su eleccion (P=piedra, L=papel, T=tijeras): ");
                me = sc.next().charAt(0);
                me = Character.toUpperCase(me);
            }

            else{//Sino, se cierra la aplicacion
                break;
            }
        }

        sc.close();
    }
}
