package builder;

import builder.builders.CarBuilder
import builder.builders.TruckBuilder
import builder.director.Director

fun main() {

    val director = Director()

    val carBuilder = CarBuilder()
    director.constructSedanCar(carBuilder)
    println(carBuilder.result())

    val truckBuilder = TruckBuilder()
    director.constructTrucker(truckBuilder)
    println(truckBuilder.result())

    val sportCarBuilder = CarBuilder()
    director.constructSportCar(sportCarBuilder)
    println(sportCarBuilder.result())

    val carManualBuilder = CarBuilder()
    director.constructCar(carManualBuilder)
    println(carManualBuilder.result())
}
