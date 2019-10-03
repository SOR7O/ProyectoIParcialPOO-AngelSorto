open class CollectGold(val name: String, var gold: Int, var fatigue: Int, var thirst: Int) {
    override fun toString(): String {
        return "Nombre: $name Oro: $gold, Fatiga: $fatigue, Sed: $thirst"
    }

}