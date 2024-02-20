package builder.vehicles

import builder.components.Engine
import builder.components.Transmission
import builder.components.VehicleType

data class Car(
    private val carType: VehicleType,
    private val seats: Int,
    private val engine: Engine,
    private val transmission: Transmission
) {
    fun result() = "Car with motor: ${engine.getPower()} and Transmission: ${transmission}.\nWith Success"
}