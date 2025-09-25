/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.desafio_15;

/**
 *
 * @author camif
 */

import java.util.Random; // Importamos la clase Random para generar números aleatorios

// =====================================================
// CLASE BASE: Vehiculo
// =====================================================
// Clase abstracta que servirá como modelo para Auto y Moto
abstract class Vehiculo {
    // ================================
    // ATRIBUTOS
    // ================================
    protected String nombre;   // Nombre del vehículo (ej: "Auto Rojo")
    protected int distancia;   // Distancia recorrida en metros

    // ================================
    // CONSTRUCTOR
    // ================================
    public Vehiculo(String nombre) {
        this.nombre = nombre;
        this.distancia = 0; // Al inicio, todos comienzan con 0 metros recorridos
    }

    // ================================
    // MÉTODOS ABSTRACTOS Y GETTERS
    // ================================
    // Método abstracto: cada subclase (Auto y Moto) definirá cómo avanza
    public abstract void avanzar();

    // Devuelve la distancia recorrida hasta el momento
    public int getDistancia() {
        return distancia;
    }

    // Devuelve el nombre del vehículo
    public String getNombre() {
        return nombre;
    }
}

// =====================================================
// SUBCLASE: Auto
// =====================================================
class Auto extends Vehiculo {
    private Random rand = new Random(); // Objeto Random para generar avance aleatorio

    // Constructor que llama al de la clase base (Vehiculo)
    public Auto(String nombre) {
        super(nombre);
    }

    @Override
    public void avanzar() {
        // El auto avanza entre 10 y 20 metros por turno
        // rand.nextInt(11) genera un número entre 0 y 10 → al sumarle 10 queda entre 10 y 20
        distancia += rand.nextInt(11) + 10;
    }
}

// =====================================================
// SUBCLASE: Moto
// =====================================================
class Moto extends Vehiculo {
    private Random rand = new Random(); // Objeto Random para generar avance aleatorio

    // Constructor que llama al de la clase base (Vehiculo)
    public Moto(String nombre) {
        super(nombre);
    }

    @Override
    public void avanzar() {
        // La moto avanza entre 5 y 25 metros por turno
        // rand.nextInt(21) genera un número entre 0 y 20 → al sumarle 5 queda entre 5 y 25
        distancia += rand.nextInt(21) + 5;
    }
}

// =====================================================
// CLASE PRINCIPAL: Carrera
// =====================================================
public class Desafio_15 {
    public static void main(String[] args) {
        // Creamos un arreglo polimórfico de Vehiculos
        // En este arreglo podemos mezclar Autos y Motos porque todos heredan de Vehiculo
        Vehiculo[] competidores = {
            new Auto("Auto Rojo"),
            new Moto("Moto Azul"),
            new Auto("Auto Verde"),
            new Moto("Moto Negra")
        };

        // ================================
        // SIMULACIÓN DE 5 RONDAS
        // ================================
        for (int ronda = 1; ronda <= 5; ronda++) {
            System.out.println("Ronda " + ronda + ":");

            // Recorremos todos los competidores
            for (Vehiculo v : competidores) {
                v.avanzar(); // Cada vehículo avanza su distancia aleatoria
                System.out.println(v.getNombre() + " ha recorrido " + v.getDistancia() + " metros");
            }

            System.out.println("-------------------------");
        }

        // ================================
        // DETERMINAR EL GANADOR
        // ================================
        Vehiculo ganador = competidores[0]; // Tomamos el primer competidor como referencia inicial

        // Recorremos el resto y comparamos sus distancias
        for (Vehiculo v : competidores) {
            if (v.getDistancia() > ganador.getDistancia()) {
                ganador = v; // Actualizamos al ganador si alguien recorrió más distancia
            }
        }

        // Mostramos el resultado final
        System.out.println("El ganador es " + ganador.getNombre() +
                           " con " + ganador.getDistancia() + " metros recorridos.");
    }
}