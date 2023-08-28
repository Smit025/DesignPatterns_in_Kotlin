package CreationalPattern

//Multiple ways to create Singleton Pattern

object Singleton {

}

class Singleton1 private constructor() {

    companion object {
        val singleton1: Singleton1 by lazy {
            Singleton1()
        }
    }
}


//Thread Safe Way to create Singleton
class Singleton2 private constructor() {

    companion object {
        @Volatile
        private var instance: Singleton2? = null
        fun getInstance(): Singleton2 {
            if (instance == null) {
                synchronized(this) {
                    if (instance == null) {
                        instance = Singleton2()
                    }
                }
            }
            return instance!!
        }
    }

}