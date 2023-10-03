package singleton

import org.junit.jupiter.api.Test

class MySingletonLazyTest {

    @Test
    fun `test`() {
        // Let's create a singleton lazy instance
        val mySingletonLazy = MySingletonLazy.getInstance()
        mySingletonLazy.incrementCounter()
        mySingletonLazy.printCounter()

        // Now let's create another reference to the same singleton
        val anotherSingletonLazy = MySingletonLazy.getInstance()
        anotherSingletonLazy.incrementCounter()
        anotherSingletonLazy.printCounter()

        // Now check that the first singleton reference still has the same counter as the second one
        mySingletonLazy.printCounter()
    }
}