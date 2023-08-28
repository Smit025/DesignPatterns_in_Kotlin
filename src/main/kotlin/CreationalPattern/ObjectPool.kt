package CreationalPattern

class DataBaseConnection {
    fun connect() {
        println("Database is Connected..")
    }

    fun disconnect() {
        println("Database is Disconnected..")
    }
}

class ObjectPool<T>(private val pool: Int, factory: () -> T) {
    private val listOfPool = mutableListOf<T>()

    init {
        repeat(pool) {
            listOfPool.add(factory())
        }
    }

    fun getObject(): T? {
        return synchronized(listOfPool) {
            if (listOfPool.isEmpty()) {
                null
            } else {
                listOfPool.removeAt(listOfPool.size - 1)
            }
        }
    }

    fun addToPool(obj: T?) {
        synchronized(listOfPool) {
            if (listOfPool.size < pool) {
                if (obj != null) {
                    listOfPool.add(obj)
                }
            }
        }
    }

}

fun main() {
    val objectPool = ObjectPool(5) { DataBaseConnection() }
    val connection1: DataBaseConnection? = objectPool.getObject()
    val connection2 = objectPool.getObject()
    connection1?.connect()
    connection2?.connect()

    objectPool.addToPool(connection1)
    objectPool.addToPool(connection2)
}
