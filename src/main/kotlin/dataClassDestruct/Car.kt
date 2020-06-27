package dataClassDestruct

data class CarData(
    val wheels: Int,
    val name: String, // added later
    val model: String
    )

class Car {
    fun printCar(car: CarData):String{
        val (wheels, model) = car
        return "wheels: $wheels " +
                "- model: $model "
    }

}

fun main() {
    val trabbi = CarData(4, "something","601")
    println(Car().printCar(trabbi))
}
