package dataClassDestruct

import kotlin.test.Test
import kotlin.test.assertEquals

class CarTest {
    @Test fun testAppHasAGreeting() {
        val classUnderTest = Car()
        val trabbi = CarData(4, "something","601")
        assertEquals(classUnderTest.printCar(trabbi), "wheels: 4 - model: something ") // model value is wrong
    }
}
