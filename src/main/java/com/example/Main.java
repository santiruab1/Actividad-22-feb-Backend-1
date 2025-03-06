package com.example;

public class Main {
    public static void main(String[] args) {

        // ¿Qué aprendiste al crear y utilizar objetos? ¿Cómo cambia el estado de un objeto cuando usamos métodos set? ¿Qué ventajas tiene inicializar los atributos de un objeto al crearlo?
        // Aprendí que los objetos son instancias de una clase y que cada objeto puede tener propiedades diferentes. Al usar los métodos set, podemos actualizar el estado de un objeto. Las ventajas de inicializar los atributos de un objeto al crearlo son que podemos asignar valores iniciales a los atributos y asegurarnos de que el objeto tenga un estado válido desde el principio.
        Jugador jugador1 = new Jugador ("Juan", 25, "Delantero", 9, "Real Madrid");
        Jugador jugador2 = new Jugador ("Pedro", 22, "Defensa", 5, "Barcelona");
        Jugador jugador3 = new Jugador ("Luis", 30, "Medio", 10, "Atletico de Madrid");
        Jugador jugador4 = new Jugador ("Carlos", 27, "Portero", 1, "Sevilla");

        jugador1.mostrarInformacion();
        jugador2.mostrarInformacion();
        jugador3.mostrarInformacion();
        jugador4.mostrarInformacion();

        jugador1.setEquipo("Atletico de Madrid");
        jugador2.setEdad(23);
        jugador3.setPosicion("Defensa");
        jugador4.setNumeroCamiseta(13);

        jugador1.mostrarInformacion();
        jugador2.mostrarInformacion();
        jugador3.mostrarInformacion();  
        jugador4.mostrarInformacion();
    }
}