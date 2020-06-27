package dataClassDestruct

data class CarData(
    val wheels: Int,
    val name: String, // added later
    val model: String
    )

class Car {
    fun printCar(car: CarData):String{
        val (wheels, name, model) = car
        return "wheels: $wheels " +
                "- model: $model " +
                "- name: $name"

    }

}

fun main() {
    val trabbi = CarData(wheels = 4, name = "trabbi", model = "601")
    println(Car().printCar(trabbi))
}
