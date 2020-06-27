package dataClassDestruct

data class CarData(
    val wheels: Int,
    val name: String, // added later
    val model: String
    )

class Car {
    val greeting: String
        get() {
            return "Hello world."
        }
    fun printCar(car: CarData):String{
        val (wheels, model, name) = car
        return "wheels: $wheels " +
                "- model: $model " +
                "- name: $name"

    }

}

fun main() {
    println(Car().greeting)
    val trabbi = CarData(wheels = 4, name = "something", model = "601")
    println(Car().greeting)
    println(Car().printCar(trabbi))
}
