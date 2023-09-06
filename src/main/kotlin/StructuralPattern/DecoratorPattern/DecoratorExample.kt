package StructuralPattern.DecoratorPattern

interface Decorate {
    fun decorateForParty(): String
}

class LivingRoom : Decorate {
    override fun decorateForParty(): String {
        return "Romm is decorated for party"
    }

}

class DecoratorExample(private val livingRoom: LivingRoom) : Decorate {
    override fun decorateForParty(): String {
        return livingRoom.decorateForParty() + " Balloon's added"
    }
}

fun main() {
    val livingRoom = LivingRoom()
    val decoratorExample = DecoratorExample(livingRoom)
    println(decoratorExample.decorateForParty())
}

