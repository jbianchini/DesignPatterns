package singleton

class MySingletonLazy {
    // Singleton properties and methods
    var counter: Int = 0

    fun incrementCounter() {
        counter++
    }

    fun printCounter() {
        println("Counter: $counter")
    }

    companion object {
        private var instance: MySingletonLazy? = null

        fun getInstance(): MySingletonLazy {
            if (instance == null) {
                instance = MySingletonLazy()
            }
            return instance!!
        }
    }
}