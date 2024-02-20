package builder.vehicles

import builder.components.Engine
import builder.components.Transmission
import builder.components.VehicleType

data class Truck (
    private val carType: VehicleType = VehicleType.TRUCK,
    private val seats: Int,
    private val engine: Engine,
    private val transmission: Transmission
) {
    fun result() =
        "Truck with motor: ${engine.getPower()} and Transmission: ${transmission}.\nWith Success"
}