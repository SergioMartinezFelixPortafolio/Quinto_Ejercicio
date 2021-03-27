/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.quintoejercicio;

import java.util.Scanner;

/**
 *
 * @author sergi
 */
public class QuintoEjercicio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        java.util.Random aleatorio = new java.util.Random();
        Scanner sc = new Scanner(System.in);
        System.out.println("How many people do you want to create? ");
        int number = Integer.parseInt(sc.nextLine());

        for (int i = 1; i < number + 1; i++) {     //tira hasta número y sube de uno en uno, y luego abajo en sout al sumarle la i te va enseñando de cuanto en cuanto va subiendo
            char letter = (char) (aleatorio.nextInt(25) + 65);
            String dni = "";
            for (int j = 0; j < 8; j++) {
                int numeroDni = 0 + aleatorio.nextInt(10 - 0);         // para crear el número de dni aleatorio está creando 8 números aleatorios numeroDni y los va sumando a DNI
                dni += numeroDni;
            }

            int edad = 0 + aleatorio.nextInt(99 - 0);

            String genero = aleatorio.nextBoolean() ? "Girl" : "Guy";       //ya he declarado random como aleatorio, ahora que me de datos aleatorios entre hombre y mujer
            System.out.println("\n" + "Person " + "" + i);     //AQUÍ TE VA MOSTRANDO LAS I Y A CADA I LE AÑADE TODO LO DE ABAJO     
            System.out.println(dni + "" + letter);           // en la i anterior podría poner un +1 para solucionar lo de persona 0, sería todo entreparentesis
            System.out.print(edad + " years old");                    // para que no lo concatene
            System.out.println("");
            System.out.println(genero);
            if (genero.equals("Guy")) {
                String randomGuyNames[] = {"Manuel", "Luís", "Alberto"};
                System.out.print(randomGuyNames[aleatorio.nextInt(randomGuyNames.length)]);    // primero la lengh va a contar que hay 3 nombres, luego el
                String randomSurname[] = {"Gómez", "Martínez"};                                               //aleatorio.nextInt va a coger uno de los 3 
                System.out.println(" " + randomSurname[aleatorio.nextInt(randomSurname.length)]);
            } else {
                String randomGirlNames[] = {"Carla", "Manolí", "Ana"};
                System.out.print(randomGirlNames[aleatorio.nextInt(randomGirlNames.length)]);    //la lenght sería de 3 nombres, y le estas diciendo aquí que 
                String randomSurname[] = {"Gómez", "Martínez"};                                               //muestre uno aleatoriamente  de los tres nombres
                System.out.println(" " + randomSurname[aleatorio.nextInt(randomSurname.length)]);
            }

        }
    }

}
