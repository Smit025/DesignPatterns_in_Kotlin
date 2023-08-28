import java.util.concurrent.Flow

interface Car {
    fun engine()
    fun stop()
}

class BMW : Car {
    override fun engine() {
        println("Starting BMW..Brum..Brum")
    }

    override fun stop() {
        println("stopping car")
    }

}

class Audi(private val car: Car) : Car by car {
    override fun engine() {
        car.engine()
    }

    override fun stop() {

    }
}

fun main() {
    val car = BMW()
    Audi(BMW()).engine()

}

