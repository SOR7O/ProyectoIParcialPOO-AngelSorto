import  java.util.*
import kotlin.concurrent.thread

fun main(args: Array<String>) {

    //Asignar valores al minero de la clase Miner
    val MinerBob = Miner("Bob", "${Random().nextInt((3 - 1)) + 1}", "${Random().nextInt((5 - 1)) + 1}", 0)
    //Mostrar datos de inicio del Minero
    MinerBob.show()

    val collectGold = CollectGold("Bob", 1, 2, 1)


    //Ciclo para que se repita la actividad del minero
    while (MinerBob.num != 4 && MinerBob.numF != 13 && MinerBob.thirst != 7) {
        MinerBob.makeSale()
    }


}


