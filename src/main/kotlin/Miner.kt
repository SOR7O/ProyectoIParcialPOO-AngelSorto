import java.lang.Exception

open class Miner(val name: String, var gold: String, var fatigue: String, var thirst: Int) {

    //Cambia de valores para el oro de tipo String que es random a Entero
    open var num = gold.toInt()
    //Cambia de valores para el oro de tipo String que es random a Entero
    open var numF = fatigue.toInt()

    //Aqui mostramos los datos del Minero
    fun show() {
        println("""
        Minero
        nombre:$name
        Oro: $gold
        Fatiga:$fatigue
        Sed: $thirst
        """)
    }

    override fun toString(): String {
        return "Nombre: $name,Oro:$gold, Fatiga:$fatigue, Sed:$thirst"
    }

    //Hacer todos los procedimientos que el minero va a ejercer
    open fun makeSale() {
        println("${name} esta recolectando una pepita de oro. Oro actual ${num}")

        //Condicion por si cumple con la sed
        if (thirst >= 5) {
            println("Tengo mucha sed")
            println("El minero ${name} se dirige a la taberna sasiar su sed")
            println("De regreso a la mina")
            thirst -= 5
        }
        //Condicion por si cumple con la fatiga
        if (numF >= 10) {
            println("Tengo mucho cansancio")
            println("El minero ${name} se dirige a su hogar a descansar")
            println("De regreso a la mina")
            numF -= 10
        }
        //Condicion por si cumple con la cantidad de oro que tendra que vender
        if (num == 3) {
            println("El minero ${name} se dirige al banco a vender sus pepitas de oro. Oro actual ${num}")
            println("De regreso a la mina")
            num -= 3
        }

        num++//Incremento de 1 cada vez que el minero encuentra una pepita de oro
        numF += 2//Incremento de 2 por cada pepita de oro
        thirst++//Incremento  de 1 de sed por cada pepita de oro
        try {
            Thread.sleep(1000)
        } catch (ex: Exception) {
            println(ex.message)
        }

    }

}