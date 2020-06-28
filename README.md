# Destruction Declarations Custom Data Classes

[Destructuring declarations together with non-trivial custom data classes](https://twitter.com/kotlin/status/1276083456854941697) 
showcase code.

Destructing custom data classes shall be done with care.

A data class: 

```kotlin
data class CarData(
    val wheels: Int,
    val model: String
)
```

can be destructed:
```kotlin
    fun printCar(car: CarData):String{
        val (wheels, model) = car
        return "wheels: $wheels " +
                "- model: $model "
    }
```

(branch 01).

However, adding a property to the data class:

```kotlin
data class CarData(
    val wheels: Int,
    val name: String, // added later
    val model: String
)
```

```kotlin
val trabbi = CarData(4, "something","601")
```

can cause misleading results

```kotlin
    fun printCar(car: CarData):String{
        val (wheels, model) = car
        return "wheels: $wheels " +
                "- model: $model "
    }
```

(branch 02)

Adapting the destruction to the property 

```kotlin
    fun printCar(car: CarData):String{
        val (wheels, model, name) = car
        return "wheels: $wheels " +
                "- model: $model " +
                "- name: $name "
    }
```

improves the code

(branch 03)

One way to fix is map by name  
```kotlin
val trabbi = CarData(wheels = 4, name = "trabbi", model = "601")
```


Run

```bash
./gradlew run
```

Test

```bash
./gradlew test
```