package CreationalPattern

interface Monster : Cloneable {
    public override fun clone(): Monster
    fun displayMonster()
}

class Godzilla : Monster {
    override fun clone(): Monster {
        return Godzilla()
    }

    override fun displayMonster() {
        println("I am Godzilla")
    }
}

fun main() {
    val godzilla: Monster = Godzilla()
    val copyGodzilla: Monster = godzilla.clone()
    println("Original monster: ${godzilla.javaClass.simpleName}")
    println("Cloned monster: ${copyGodzilla.javaClass.simpleName}")
    godzilla.displayMonster()
    copyGodzilla.displayMonster()
}