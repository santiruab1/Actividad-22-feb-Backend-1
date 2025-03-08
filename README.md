# Actividad Practica Backend 1 | 22 febrero 2025

En esta actividad, desarrollé un programa en Java para aplicar los conceptos fundamentales de la Programación Orientada a Objetos (POO).
Comencé creando la clase **Jugador**, definiendo sus atributos de manera privada para aplicar el principio de encapsulamiento. Luego, implementé un constructor para inicializar los atributos al instanciar un objeto. Posteriormente, agregué métodos de acceso (getters) y modificación (setters) para cada atributo, permitiendo la manipulación controlada de los datos.
También desarrollé un método **mostrarInformacion**, que imprime en consola los detalles del jugador en un formato claro. Finalmente, en el método **main**, creé dos objetos de la clase **Jugador**, utilicé los métodos definidos para mostrar y modificar sus atributos, y observé cómo cambia el estado de los objetos con el uso de los setters.

## Reflexiones de esta actividad

¿Qué representa esta clase? ¿Qué información contiene?

> Esta clase representa los futuros objetos jugardores y contiene la información básica de este.

¿Por qué es importante inicializar los atributos al crear un objeto? ¿Qué pasaría si no usáramos un constructor?

> Porque este metodo permite el acceso a la información desde la clase Main dado que los atributos de la clase Jugador son privados.

¿Por qué no accedemos directamente a los atributos desde otras clases? ¿Qué ventajas tiene usar getters y setters?

> Porque los atributos son privados y no se pueden acceder directamente desde otras clases. Los getters y setters permiten acceder a los atributos de la clase Jugador desde la clase Main.

¿Qué otros métodos podrían ser útiles para la clase Jugador? ¿Cómo podríamos mejorar este método?

> Otros métodos útiles para la clase Jugador podrían ser verificar si el jugador es mayor de edad, para saber si es apto para debutar en las ligas mayores, por ejemplo.
> 
> Podríamos mejorar este método agregando un salto de linea para diferenciar las diferentes informaciones de los jugadores al momento de la impresion. Además, se puede mejorar agregando más información sobre el jugador, como su salario, su nacionalidad, etc. Igualmente esto implicaria crear nuevos atributos y métodos para la clase Jugador.

¿Qué aprendiste al crear y utilizar objetos? ¿Cómo cambia el estado de un objeto cuando usamos métodos set?

> Aprendí que los objetos son instancias de  una clase y que cada objeto puede tener propiedades diferentes. Al usar los métodos set, podemos actualizar el estado de un objeto. Las ventajas de inicializar los atributos de un objeto al crearlo son que podemos asignar valores iniciales a los atributos y asegurarnos de que el objeto tenga un estado válido desde el principio.





