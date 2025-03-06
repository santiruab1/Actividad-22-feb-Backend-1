package com.example;

// ¿Qué representa esta clase? ¿Qué información contiene?
// Esta clase representa los futuros objetos jugardores y contiene la información básica de este.

public class Jugador {
    private String nombre;
    private int edad;
    private String posicion;
    private int numeroCamiseta;
    private String equipo;

    // ¿Por qué es importante inicializar los atributos al crear un objeto? ¿Qué
    // pasaría si no usáramos un constructor?
    // Porque este metodo permite el acceso a la información desde la clase Main
    // dado que los atributos de la clase Jugador son privados

    public Jugador(String nombre, int edad, String posicion, int numeroCamiseta, String equipo) {
        this.nombre = nombre;
        this.edad = edad;
        this.posicion = posicion;
        this.numeroCamiseta = numeroCamiseta;
        this.equipo = equipo;
    }

    // ¿Por qué no accedemos directamente a los atributos desde otras clases? ¿Qué
    // ventajas tiene usar getters y setters?
    // Porque los atributos son privados y no se pueden acceder directamente desde
    // otras clases. Los getters y setters permiten acceder a los atributos de la
    // clase Jugador desde la clase Main.

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public int numeroCamiseta() {
        return numeroCamiseta;
    }

    public void setNumeroCamiseta(int numeroCamiseta) {
        this.numeroCamiseta = numeroCamiseta;
    }

    public String getEquipo() {
        return equipo;
    }

    public void setEquipo(String equipo) {
        this.equipo = equipo;
    }

    // ¿Qué otros métodos podrían ser útiles para la clase Jugador? ¿Cómo podríamos mejorar este método?
    // Otros métodos útiles para la clase Jugador podrían ser verificar si el jugador es mayor de edad, para saber si es apto para debutar en las ligas mayores, por ejemplo.
    // Podríamos mejorar este método agregando un salto de linea para diferenciar las diferentes informaciones de los jugadores al momento de la impresion. Además, se puede mejorar agregando más información sobre el jugador, como su salario, su nacionalidad, etc. Igualmente esto implicaria crear nuevos atributos y métodos para la clase Jugador.


    // Método para mostrar la información de un jugador
    public void mostrarInformacion() {
        System.out.println("\n" + "**********");
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Posición: " + posicion);
        System.out.println("Número de Camiseta: " + numeroCamiseta);
        System.out.println("Equipo: " + equipo);
    }

    // Método para verificar si el jugador es mayor de edad
    public boolean esMayorDeEdad() {
        return this.edad >= 18;
    }

}
