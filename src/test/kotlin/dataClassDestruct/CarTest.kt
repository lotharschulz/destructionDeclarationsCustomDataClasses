package dataClassDestruct

import kotlin.test.Test
import kotlin.test.assertEquals

class CarTest {
    @Test fun testAppHasAGreeting() {
        val classUnderTest = Car()
        val trabbi = CarData(4, "601")
        assertEquals(classUnderTest.printCar(trabbi), "wheels: 4 - model: 601 ")
    }
}
