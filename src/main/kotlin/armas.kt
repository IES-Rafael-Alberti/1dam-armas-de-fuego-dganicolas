import java.lang.Math.random
import kotlin.random.Random

/**
Implementar una clase ArmaDeFuego con sus métodos y propiedades:
 *
 * Propiedades (ninguna de las propiedades, excepto danio y radio, podrá accederse desde fuera de esta clase)
 *
 * nombre: String----
 * municion: Int----
 * municionARestar: Int
 * tipoDeMunicion: String (9mm, 7.62mm, 60mm, RPG, ... etc)
 * Estas dos últimas propiedades solo deben declararse, sin inicializarse en la clase Armas de fuego.
 *
 * danio: Int
 * radio: String (puede tomar solo los valores "Reducido", "Corto", "Intermedio", "Amplio" y "Enorme")
 * Todas las armas de fuego deberán compartir la caja de municiones extra para recargar:
 *
 * cantidadMunicionExtra: Int (debe inicializarse con un valor aleatorio entre 5 y 15)
 * Metodos
 *
 * dispara: resta munición (utiliza correctamente a municionARestar) y muestra un mensaje dónde indiques que arma de fuego se ha disparado y la munición restante. Si no tiene suficiente munción debe recargar y disparar. Si no tiene munición extra de recarga debe mostrar "No hay suficiente munición para disparar.".
 *
 * recarga: aumenta la munición y muestra un mensaje dónde indiques que arma de fuego se ha recargado y la munición actual después de dicha recarga. Debe intentar recargar el doble de la municion a restar cuando dispara. Si no hay suficiente munición extra, entonces intenta recargar solo la munición a restar. Si no puede realizar la recarga debe mostrar el mensaje "No hay suficiente munición extra para recargar.".
 *
 * mostrarInfo: debe mostrar el valor de todas sus propiedades (Nombre: Rifle, Munición: 6, Tipo de Munición: 9mm, Daño: 5, Radio: Intermedio).
 *
 * NOTA: Se pretende que la clase ArmaDeFuego refleje la intención del programador de que sirva como una superclase para tipos más específicos de armas y prevenir su instanciación directa, manteniendo así la coherencia y la claridad en la jerarquía de clases del programa.
 * */
abstract class Armas(
    val nombre: String,
    var municion:Int,
    val municionArestar:Int,
    val tipoDemunicion: String) {
    abstract val danio: Int
    abstract val radio: Radio
    companion object{
        var cantidadMunicionExtra = Random(5).nextInt(15)
    }
    //dispara: resta munición (utiliza correctamente a municionARestar) y muestra un mensaje dónde indiques que arma de fuego se ha disparado y la munición restante. Si no tiene suficiente munción debe recargar y disparar. Si no tiene munición extra de recarga debe mostrar "No hay suficiente munición para disparar.
    fun dispara(){
        if (municion > municionArestar){ // aqui te comprueba directamente si puede dispara, si no puede
            municion.minus(municionArestar)
        }else{
            recarga()
            if (municion > municionArestar){ //lo cumpruebo por segunda vez despues de haber recargado, para ver si puede disparar
                municion.minus(municionArestar)}
            else{
                println("No hay suficiente munición para disparar") //ya no hay mas balas
            }
        }
    }
    fun recarga(){
        if (municion  < cantidadMunicionExtra){// comprueba si tiene municion extra para recargar una vez

            if (municion+(cantidadMunicionExtra*(municionArestar*2)) < cantidadMunicionExtra){ // comprueba si tiene municion extra para recargar 2 veces
                municion += municionArestar*2
                cantidadMunicionExtra -= municionArestar*2
            }else {
                municion += municionArestar
                cantidadMunicionExtra -= municionArestar
            }
        }
    }
    fun mostrarInfo(): String{

        return "Nombre: $nombre, Munición: $municion, Tipo de Munición: $tipoDemunicion, Daño: $danio, Radio: $radio"
    }
}