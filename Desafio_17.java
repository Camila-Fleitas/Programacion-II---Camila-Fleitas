/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

// Lista de nombres
//Implementar un programa que use un ArrayList<String> para almacenar nombres ingresados manualmente
//y luego mostrarlos en pantalla.

package com.mycompany.desafio_17;

/**
 *
 * @author camif
 */

// Importamos las librerías necesarias
import java.util.List;      // 'List' es una interfaz que representa una lista de elementos
import java.util.Scanner;   // 'Scanner' sirve para leer datos que el usuario escriba en la consola
import java.util.ArrayList; // 'ArrayList' es una clase que implementa la interfaz List y permite guardar elementos en una lista dinámica

// Clase principal del programa
public class Desafio_17 {
    public static void main(String[] args) { // Método principal, donde arranca el programa
        
        // Creamos una lista de Strings (texto) para guardar los nombres
        List<String> nombres = new ArrayList<>();
        
        // Mensajes iniciales para el usuario
        System.out.println("=== GESTOR DE NOMBRES ===");  
        System.out.println("Ingresa nombres (escribe 'salir' para terminar):");
        
        // Creamos un objeto Scanner para leer lo que escriba el usuario en la consola
        Scanner scanner = new Scanner(System.in);
        
        // Variable donde vamos a guardar temporalmente cada nombre que ingrese el usuario
        String nombre;
        
        // Bucle infinito (se repite hasta que el usuario escriba "salir")
        while (true) {
            System.out.print("Nombre: "); // Pedimos que escriba un nombre
            
            // Leemos lo que el usuario escribió y lo guardamos en la variable 'nombre'
            nombre = scanner.nextLine();
            
            // Si el usuario escribe "salir", se rompe (termina) el ciclo
            if (nombre.equalsIgnoreCase("salir")) { 
                break; // Sale del while
            }
            
            // Si no escribió "salir", agregamos el nombre a la lista 'nombres'
            nombres.add(nombre);
        }
        
        // Mensaje de separación
        System.out.println("\n--- Nombres ingresados ---"); 
        
        // Si la lista está vacía, quiere decir que no se ingresó ningún nombre
        if (nombres.isEmpty()) { 
            System.out.println("No se ingresaron nombres.");
        } else {
            // Si la lista tiene nombres, recorremos cada elemento y lo mostramos en pantalla
            for (int i = 0; i < nombres.size(); i++) { 
                // Imprimimos el número del nombre (i+1 porque los índices empiezan en 0)
                // y el nombre en esa posición de la lista
                System.out.printf("%d. %s%n", i + 1, nombres.get(i));
            }
        }
    }
}
