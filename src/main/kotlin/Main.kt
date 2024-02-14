/**
 * Descripción:
 * El ejercicio constará de dos partes:
 * Parte 1: Implementa las sub-armas.
 *
 * Pistola: Resta munición * 1
 * Debe requerir que danio sea un valor entre 1 y 5; radio debe ser reducido o corto.
 * Rifle: Resta munición * 2
 * Debe requerir que danio sea un valor entre 5 y 10; radio debe ser corto o intermedio.
 * Bazooka: Resta munición * 3
 * Debe requerir que danio sea un valor entre 10 y 30; radio debe estar entre intermedio y enorme.
 * Crea una instancia de cada arma desde el programa principal denro de una lista.
 *
 * Muestra en mensaje con la munición extra que existe... "\nMunición extra = 11... para todas las armas de fuego.\n"
 *
 * Crea un mapa en el que registrar aletoriamente 12 disparos sobre armas... cada arma realizará entre 1 y 3 disparos de forma aleatoria.
 *
 * Recorre el mapa... dispara y muestra su información cada vez que dispares.
 *
 * Para ello, crea una lista de armas de fuego con las 3 sub-armas. Muestra el mensaje de la munición extra.
 * val disparos = (1..12).map { armas.random() to (1..3).random() } // Creación del mapa (punto 3.) Recorre disparos disparando y mostrando la info según el número de veces aleatoria que se haya creado en cada elemento de la lista disparos (analiza bien la instrucción anterior)
 *
 * Si no puedes resolverlo cómo se indica en las instrucciones anteriores hazlo a tu forma... debes crear 12 sub-armas de forma aleatoria que disparen y muestren su info de forma aleatoria entre 1 y 3 veces cada una.
 *
 * Deben dispararse 12 armas, cada una entre 1 y 3 veces... muestra también un mensaje que identifique cada comienzo de los 12 disparos
 *
 * NOTA: Todas los objetos o instancias que realicemos de la clase Pistola tendrán como nombre "Pistola" sin necesidad de pasar ningún String su constructor. Lo mismo ocurrirá con Rifle y Bazooka.
 *
 * Ejemplo de resultado en la consola:
 *
 * Resultado de ejecución del programa en consola
 *
 * *** Parte 2: Modifica el programa para contemplar que otros objetos puedan Disparar. ***
 *
 * Genera aleatoriamente disparos, en este caso 9, para las armas de fuego y para tres clases más (Casa, Coche y Bocadillo).
 * La clase Casa dispara confetti.
 * La clase Coche dispara ráfagas de luz larga.
 * La clase Bocadillo dispara olor a jamón.
 * */
fun main(args: Array<String>) {
    println("Hello World!")

    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    println("Program arguments: ${args.joinToString()}")
}