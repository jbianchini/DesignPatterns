package singleton

import org.junit.jupiter.api.Test

class MySingletonObjectTest {

    @Test
    fun `test`(){
        val singletonReference = MySingletonObject

        singletonReference.incrementCounter()
        println("Counter: ${singletonReference.getCounter()}")

        val anotherSingletonReference = MySingletonObject
        println("Counter from another reference: ${anotherSingletonReference.getCounter()}")

        anotherSingletonReference.incrementCounter()
        println("Counter from first reference: ${singletonReference.getCounter()}")


    }
}