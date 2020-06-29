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
(full showcase code in branch destructDeclarationsCustomDataClasses01)

---

However, adding a new property (name) to the data class:

```kotlin
data class CarData(
    val wheels: Int,
    val name: String, 
    val model: String
)
```

```kotlin
val trabbi = CarData(4, "something","601")
```

can cause misleading results if the destructing code remains untouched:

```kotlin
fun printCar(car: CarData):String{
    val (wheels, model) = car
    return "wheels: $wheels " +
            "- model: $model "
}
```

(full showcase code in branch destructDeclarationsCustomDataClasses02)

---

Adapting the destruction of car

```kotlin
fun printCar(car: CarData):String{
    val (wheels, model, name) = car
    return "wheels: $wheels " +
            "- model: $model " +
            "- name: $name "
}
```

improves the code

(full showcase code in branch  destructDeclarationsCustomDataClasses03)

---

Additional ways to improve the fix are 

- _data class constructor default values_
 
  ```kotlin
  data class CarData(
      val wheels: Int = 0,
      val name: String = "", // added later
      val model: String = ""
  )
  ```
 
- _map by name_  
  ```kotlin
  val trabbi = CarData(wheels = 4, name = "trabbi", model = "601")
  ```

---
---

Run the code

```bash
./gradlew run
```

Run the code

```bash
./gradlew test
```