/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.desafio_6;

/**
 *
 * @author camif
 */

// Definimos una clase abstracta llamada Personaje
// Esta clase será la base para crear distintos tipos de personajes
abstract class Personaje {
    // ================================
    // ATRIBUTOS
    // ================================
    // 'nombre' y 'nivel' son atributos que comparten todos los personajes
    protected String nombre;
    protected int nivel;

    // ================================
    // CONSTRUCTOR
    // ================================
    // Este constructor inicializa los valores de 'nombre' y 'nivel'
    public Personaje(String nombre, int nivel) {
        this.nombre = nombre;  // Asigna el valor recibido al atributo 'nombre'
        this.nivel = nivel;    // Asigna el valor recibido al atributo 'nivel'
    }

    // ================================
    // MÉTODO ABSTRACTO
    // ================================
    // Declaramos un método abstracto llamado accionEspecial()
    // Como es abstracto, no tiene cuerpo aquí. Cada subclase lo implementará a su manera.
    public abstract void accionEspecial();
}

// =====================================================
// SUBCLASE MAGO
// =====================================================
// La clase Mago hereda de Personaje
class Mago extends Personaje {
    // Constructor que llama al constructor de la superclase (Personaje)
    // para inicializar nombre y nivel
    public Mago(String nombre, int nivel) {
        super(nombre, nivel);
    }

    // Implementamos el método abstracto 'accionEspecial'
    // Se define lo que hace un mago cuando usa su acción especial
    @Override
    public void accionEspecial() {
        System.out.println("El mago lanza un hechizo.");
    }
}

// =====================================================
// SUBCLASE GUERRERO
// =====================================================
// La clase Guerrero hereda de Personaje
class Guerrero extends Personaje {
    // Constructor que llama al constructor de la superclase (Personaje)
    // para inicializar nombre y nivel
    public Guerrero(String nombre, int nivel) {
        super(nombre, nivel);
    }

    // Implementamos el método abstracto 'accionEspecial'
    // Se define lo que hace un guerrero cuando usa su acción especial
    @Override
    public void accionEspecial() {
        System.out.println("El guerrero ataca con su espada.");
    }
}

// =====================================================
// CLASE PRINCIPAL PARA PROBAR EL CÓDIGO
// =====================================================
public class Desafio_6 {
    public static void main(String[] args) {
        // Creamos un objeto de tipo Mago
        Personaje mago = new Mago("Merlín", 10);

        // Creamos un objeto de tipo Guerrero
        Personaje guerrero = new Guerrero("Conan", 8);

        // Llamamos a sus acciones especiales
        mago.accionEspecial();      // Imprime: El mago lanza un hechizo.
        guerrero.accionEspecial();  // Imprime: El guerrero ataca con su espada.
    }
}