package singleton

object MySingletonObject {
    private var counter: Int = 0

    fun incrementCounter() = counter++

    fun getCounter() = counter
}