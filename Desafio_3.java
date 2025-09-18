/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.desafio_3; // Indica el paquete donde está guardada la clase

/**
 *
 * @author camif
 */

import java.util.Random; // Importa la clase Random para generar números aleatorios 

public class Desafio_3 { 
     // ------------------ MÉTODO AUXILIAR ------------------
    // Método que recibe un número entero y devuelve true si el número es impar
    // (cuando el resto de dividirlo entre 2 es distinto de 0).
    public static boolean esImpar(int numero) { 
        return numero % 2 != 0; 
    } 

    // Método que imprime en pantalla si el número es par o no 
    public static void mostrarClasificacion(int numero) { 
        if (esImpar(numero)) { 
            System.out.println(numero + " no es par"); // Es impar 
        } else { 
            System.out.println(numero + " es par"); // Es par 
        } 
    } 

    // ------------------ MÉTODO PRINCIPAL ------------------
    public static void main(String[] args) { 
        Random azar = new Random(); // Objeto que se usará para generar números aleatorios  
        int sumaImpares = 0; // Variable acumuladora de la suma de números impares

        // El ciclo continúa hasta que la suma de impares sea menor o igual a 25. 
        while (sumaImpares <= 25) { 
            int n = azar.nextInt(11); // Genera un número entero aleatorio entre 0 y 10 (incluye ambos).
            mostrarClasificacion(n); // Muestra en pantalla si es par o no usando el método auxiliar.

            // Si el número es impar, se acumula en la suma de impares.
            if (esImpar(n)) { 
                sumaImpares += n; 
            } 
        } 

        // Cuando el ciclo termina (sumaImpares > 25), se imprime el resultado final.
        System.out.println("Suma final de impares: " + sumaImpares);  
    } 
}
