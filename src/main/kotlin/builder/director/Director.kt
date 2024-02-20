package builder.director

import builder.builders.IVehicleBuilder
import builder.components.Engine
import builder.components.Transmission
import builder.components.VehicleType

class Director {
    fun constructSedanCar(builder: IVehicleBuilder) {
        builder.setVehicleType(VehicleType.SEDAN)
        builder.setSeats(5)
        builder.setTransmission(Transmission.AUTOMATIC)
        builder.setEngine(Engine(1600))
    }

    fun constructTrucker(builder: IVehicleBuilder) {
        builder.setVehicleType(VehicleType.TRUCK)
        builder.setSeats(2)
        builder.setTransmission(Transmission.AUTOMATIC_SEQUENTIAL)
        builder.setEngine(Engine(13000))
    }

    fun constructSportCar(builder: IVehicleBuilder) {
        builder.setVehicleType(VehicleType.SPORT_CAR)
        builder.setSeats(2)
        builder.setTransmission(Transmission.AUTOMATIC_SEQUENTIAL)
        builder.setEngine(Engine(4600))
    }

    fun constructCar(builder: IVehicleBuilder) {
        builder.setVehicleType(VehicleType.SEDAN)
        builder.setSeats(4)
        builder.setTransmission(Transmission.MANUAL)
        builder.setEngine(Engine(4600))
    }
}